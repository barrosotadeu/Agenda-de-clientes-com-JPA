package br.com.tadeu.agendas.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import br.com.tadeu.agendas.dto.ContatosDoClienteDTO;
import br.com.tadeu.agendas.modelo.Cliente;

public class ClienteDAO {
	
	private EntityManager em;
	
	public ClienteDAO(EntityManager em) {
		this.em = em;
	}
	
	public void cadastraCliente(Cliente cliente) {	
		this.em.getTransaction().begin();
		this.em.persist(cliente);
		this.em.getTransaction().commit();
		this.em.close();
		
	}
	
	public List<Cliente> listaClientes(){
		String jpql = "select c from Cliente c";
		TypedQuery tp = this.em.createQuery(jpql, Cliente.class);
		return tp.getResultList();
	}
	
	public List<Cliente> listaClientesEmOrdemCrescente(){
		
		CriteriaBuilder cb = this.em.getCriteriaBuilder();
		CriteriaQuery<Cliente> cQuery = cb.createQuery(Cliente.class);
		Root<Cliente> root = cQuery.from(Cliente.class);
		cQuery.orderBy(cb.asc(root.get("nome")));
		
		return this.em.createQuery(cQuery).getResultList();
		
//		String jpql = "SELECT c FROM Cliente c ORDER BY c.nome";
//		return this.em.createQuery(jpql, Cliente.class).getResultList();
	}
	
	public List<Cliente> listaClientesEmOrdemDecrescente(){
		
		CriteriaBuilder cb = this.em.getCriteriaBuilder();
		CriteriaQuery<Cliente> cQuery = cb.createQuery(Cliente.class);
		Root<Cliente> root = cQuery.from(Cliente.class);
		
		cQuery.select(root);
		cQuery.orderBy(cb.desc(root.get("nome")));
		
		return this.em.createQuery(cQuery).getResultList();
//		String jpql = "SELECT c FROM Cliente c ORDER BY c.nome DESC";
//		return this.em.createQuery(jpql, Cliente.class).getResultList();
	}
	
	public Cliente buscaClientePorId(Integer id) {
		return this.em.find(Cliente.class, id);
	}
	
	public void deletaCliente(Cliente cliente) {
		this.em.getTransaction().begin();
		this.em.remove(cliente);
		this.em.getTransaction().commit();
		this.em.close();
	}
	
	public void alteraCliente(Cliente cliente) {
		this.em.getTransaction().begin();
		this.em.merge(cliente);
		this.em.getTransaction().commit();
		this.em.close();
	}
	
	public List<Object[]> mostraTotalDeVendasPorCliente(){
		String jpql = "SELECT c.nome, sum(v.valor) FROM Venda v right join v.cliente c group by c.id";
		TypedQuery<Object[]> tp = this.em.createQuery(jpql, Object[].class);
		return tp.getResultList();
	}
	
	public List<ContatosDoClienteDTO> mostraClientesEContatos() {
		String jpql = "SELECT NEW br.com.tadeu.agendas.dto.ContatosDoClienteDTO(id, nome, telefone, email) FROM Cliente";
		return this.em.createQuery(jpql, ContatosDoClienteDTO.class).getResultList();
	}

}

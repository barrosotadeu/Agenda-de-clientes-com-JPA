package br.com.tadeu.agendas.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

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
	
	public Cliente buscaClientePorId(Integer id) {
		return this.em.find(Cliente.class, id);
	}
	
	public void deletaCliente(Cliente cliente) {
		this.em.getTransaction().begin();
		this.em.remove(cliente);
		this.em.getTransaction().commit();
		this.em.close();
	}

}

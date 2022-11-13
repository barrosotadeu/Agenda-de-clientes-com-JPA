package br.com.tadeu.agendas.controller;

import java.math.BigDecimal;

import javax.persistence.EntityManager;

import br.com.tadeu.agendas.modelo.Cliente;
import br.com.tadeu.agendas.modelo.Venda;

public class VendaDAO {
	
	private EntityManager em;
	
	public VendaDAO(EntityManager em) {
		this.em = em;
	}
	
	public void cadastraVenda(Venda venda) {
		this.em.getTransaction().begin();
		this.em.persist(venda);
		this.em.getTransaction().commit();
		this.em.close();
	}
	
	public BigDecimal retornaTotalDeVendasPorCliente(Cliente cliente){
		String jpql = "select sum(v.valor) from Venda v inner join v.cliente c where v.cliente.id = :id";
		//String jpql = "SELECT SUM(v.valor) FROM Venda v INNER JOIN Cliente c WHERE v.cliente.id = c.id and c.id = :id group by c.id";
		//return this.em.createQuery(jpql, BigDecimal.class).setParameter("id", cliente.getId()).getSingleResult();
		return this.em.createQuery(jpql, BigDecimal.class).setParameter("id", cliente.getId()).getSingleResult();
		
	}
}

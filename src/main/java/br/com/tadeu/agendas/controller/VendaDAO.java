package br.com.tadeu.agendas.controller;

import javax.persistence.EntityManager;

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
}

package br.com.tadeu.agendas.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUltil {
	
	private static final EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory("agendajpa");
	
	public static EntityManager getEntityManager() {
		return FACTORY.createEntityManager();
	}
}

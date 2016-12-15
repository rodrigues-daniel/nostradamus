package org.nostradamus.service;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@Stateless
public class Registrador {
	
	@Inject
	private EntityManager em;
	
	
	public void registrar(Object obj) throws Exception{
		em.persist(obj);
	}

}

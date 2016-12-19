package org.nostradamus.data;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.nostradamus.model.Mapa;

/**
 * Session Bean implementation class MapaRepository
 */
@ApplicationScoped
public class MapaRepository {

	@Inject
	private EntityManager em;

	private Mapa mapa;
	private List<Mapa> listMapa;

	public Mapa findById(Long id) {

		return em.find(Mapa.class, id);
		
		
	}

	
	@Produces
	@Named
	public List<Mapa> getListMapa() {
		Query result = em.createQuery("SELECT a FROM Mapa a",Mapa.class);
		
		this.listMapa = result.getResultList();
		
		
		return listMapa;
	}

	 

}

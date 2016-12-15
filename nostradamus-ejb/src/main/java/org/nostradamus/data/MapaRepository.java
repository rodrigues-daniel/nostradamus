package org.nostradamus.data;

import javax.ejb.Stateless;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import org.nostradamus.model.Mapa;

/**
 * Session Bean implementation class MapaRepository
 */
@ApplicationScoped
public class MapaRepository {

	@Inject
	private EntityManager em;

	private Mapa mapa;

	public Mapa findById(Long id) {

		return em.find(Mapa.class, id);
	}

}

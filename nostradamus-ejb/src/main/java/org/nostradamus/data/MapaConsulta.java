package org.nostradamus.data;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;

import org.nostradamus.model.Mapa;

@RequestScoped
public class MapaConsulta {
	
	@Inject
	private MapaRepository repository;

	
	private Mapa  idMapa;

	@Produces
	@Named
	public Mapa getIdMapa() {
		return idMapa = repository.findById((long) 2);
	}


	
	
	
	
	
	
	
}

package org.nostradamus.controller;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;

import org.nostradamus.service.Registrador;

import org.nostradamus.model.Mapa;

@Model
public class MapaConroller {

	@Inject
	private Registrador registrador;

	private Mapa novoMapa;
	
	
	
	public void registrar() throws Exception{
		
		registrador.registrar(novoMapa);
		System.out.println("Registrado!");
	}
	
	
	

	@Produces
	@Named
	public Mapa getNovoMapa() {
		return novoMapa;
	}

	
	@PostConstruct
	public void initNovoMapa() {
		novoMapa = new Mapa();
	}

}

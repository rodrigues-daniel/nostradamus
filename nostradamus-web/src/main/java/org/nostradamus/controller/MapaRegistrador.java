package org.nostradamus.controller;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Model;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;

import org.nostradamus.service.Registrador;

import org.nostradamus.model.Mapa;

@Model
public class MapaRegistrador {

	@Inject
	private Registrador registrador;

	private Mapa novoMapa;
	
	
	
	public String registrar() throws Exception{
		
		registrador.registrar(novoMapa);
		System.out.println("Registrado!");
		
		
		return "lista";
	}
	
	
	

	
	
	public Mapa getNovoMapa() {
		
		
		return novoMapa;
	}

	
	@PostConstruct
	public void initNovoMapa() {
		novoMapa();
	}
	
	
	private void  novoMapa(){
		novoMapa = new Mapa();
	}
	
	
	

}

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

	private Mapa mapa;

	@Produces
	@Named
	public Mapa novoMapa() {

		return mapa;

	}

	@PostConstruct
	public void initNovoRegistro() {

		mapa = new Mapa();

	}

	public void registrar() throws Exception {

		try {
			
			registrador.registrar(mapa);
			initNovoRegistro();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}

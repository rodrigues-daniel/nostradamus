package org.nostradamus.controller;

import java.util.Iterator;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Model;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.model.map.MapModel;
import org.primefaces.model.map.Marker;
import org.nostradamus.data.MapaRepository;
import org.nostradamus.model.Mapa;
import org.primefaces.model.map.DefaultMapModel;
import org.primefaces.model.map.LatLng;

@Model
public class MapaBean {

	@Inject
	private MapaRepository repository;

	private List<Mapa> marcas;

	private MapModel mapaModel;

	@PostConstruct
	public void initMapaModel() {
		init();

	}

	@Produces
	@Named
	public MapModel getMapaModel() {

		return mapaModel;
	}

	private void init() {
		mapaModel = new DefaultMapModel();

		marcas = repository.getListMapa();

		for (Mapa mapa : marcas) {

			System.out.println("foi");
			 
		      
				   
			mapaModel.addOverlay(new Marker(new LatLng(mapa.getLatitude(), mapa.getLongitude()), mapa.getLogradouro(),"M2"));
		}
	}

}

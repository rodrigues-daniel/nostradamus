package org.nostradamus.controller;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Model;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.push.EventBus;
import org.primefaces.push.EventBusFactory;

@Named
@ApplicationScoped
public class MapaWebSocket {

	private volatile int contador;

	@Inject
	private EventBus eventbus;

	public int getContador() {
		return contador;
	}

	@PostConstruct
	public void initContador() {

		contador = 0;

	}

	@Produces
	public EventBus sendEvento() {

		 
		return EventBusFactory.getDefault().eventBus();

	}

	public void incrementador() {
		contador++;
	

		eventbus.publish("/atualizar",contador);
		 
		

	}

}

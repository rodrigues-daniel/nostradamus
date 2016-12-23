package org.nostradamus.controller;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Model;
import javax.inject.Named;

import org.primefaces.push.EventBus;
import org.primefaces.push.EventBusFactory;

@Model
public class MapaWebSocket {

	private volatile int contador;

	@Named
	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	public void incrementador() {
		contador++;

		EventBus eventbus = new EventBusFactory().getDefault().eventBus();
		eventbus.publish("/contador", String.valueOf(contador));

	}

}

package org.nostradamus.controller;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import org.primefaces.push.RemoteEndpoint;
import org.primefaces.push.annotation.OnMessage;
import org.primefaces.push.annotation.OnOpen;
import org.primefaces.push.annotation.PushEndpoint;
import org.primefaces.push.impl.JSONEncoder;


@PushEndpoint("/atualizar")
@ApplicationScoped
public class ContadorResource implements Serializable {

	@OnMessage(encoders = { JSONEncoder.class })
	public String onMenssage(String contador) {

		return "Valor Retornado :" + contador;
	}

}

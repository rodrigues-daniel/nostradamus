package org.nostradamus.controller;

import java.io.Serializable;

import org.primefaces.push.annotation.OnMessage;
import org.primefaces.push.annotation.PushEndpoint;
import org.primefaces.push.impl.JSONEncoder;


@PushEndpoint("/contador")
public class ContadorResource implements Serializable {
	
	@OnMessage(encoders={JSONEncoder.class})
	public String onMessage(String contador){
		
		return contador;
		
	}

}

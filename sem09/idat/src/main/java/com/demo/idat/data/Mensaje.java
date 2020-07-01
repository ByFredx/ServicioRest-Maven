package com.demo.idat.data;

import io.swagger.annotations.ApiModel;

@ApiModel("MensajeModel")
public class Mensaje {

	private String mensaje;

	public Mensaje() {
	}

	public Mensaje(String mensaje) {
		super();
		this.mensaje = mensaje;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

}

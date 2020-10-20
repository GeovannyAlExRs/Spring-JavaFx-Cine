package com.cine.app.geovanny.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Configuration {

	@Bean("lblTitulo")
	private String getTitulo() {
		return "Bienvenido a Spring - Javafx";
	}
}

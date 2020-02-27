package com.transacciones;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.transacciones.ejemplo_spring5.ServicioCrearPersona;
import com.transacciones.excepciones.PersonaException;
import com.transacciones.modelo.Persona;

public class App5 {
	public static void main(String[] args) throws PersonaException {
		guardar();
	}

	private static void guardar() throws PersonaException {
		ApplicationContext contexto = new ClassPathXmlApplicationContext("spring-configuracion/config-spring.xml");

		Persona p = new Persona(999, "new", "Errord");
		Persona p2 = new Persona(92, "saasssssssssssss", "Errord");

		ServicioCrearPersona sp = (ServicioCrearPersona) contexto.getBean("servicioPersona5");

		sp.guardar(p, p2);
	}

}
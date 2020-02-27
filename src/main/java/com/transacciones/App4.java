package com.transacciones;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.transacciones.ejemplo_spring4.ServicioPersona;
import com.transacciones.excepciones.PersonaException;
import com.transacciones.modelo.Persona;

public class App4 {
	public static void main(String[] args) throws PersonaException {
		guardar();
	}

	private static void guardar() throws PersonaException {
		ApplicationContext contexto = new ClassPathXmlApplicationContext("spring-configuracion/config-spring.xml");

		Persona p = new Persona(90, "new", "Error_2");

		ServicioPersona sp = (ServicioPersona) contexto.getBean("servicioPersona4");

		sp.guardar(p);
	}

}
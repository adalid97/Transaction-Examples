package com.transacciones;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.transacciones.ejemplo_spring2.ServicioPersona;
import com.transacciones.modelo.Persona;

public class App2 {
	public static void main(String[] args) {
//		insertarPersona();
//		modificarPersona();
		metodoDelServicio();
	}

	private static void insertarPersona() {
		ApplicationContext contexto = new ClassPathXmlApplicationContext("spring-configuracion/config-spring.xml");

		Persona p1 = new Persona(1, "aaa", "aaa");

		ServicioPersona sp = (ServicioPersona) contexto.getBean("servicioPersona2");

		sp.crearPersona(p1);
	}

	private static void modificarPersona() {
		ApplicationContext contexto = new ClassPathXmlApplicationContext("spring-configuracion/config-spring.xml");

		Persona p1 = new Persona(1, "aaadsdada", "aasdadaa");

		ServicioPersona sp = (ServicioPersona) contexto.getBean("servicioPersona2");

		sp.modificarPersona(p1);
	}

	private static void metodoDelServicio() {
		ApplicationContext contexto = new ClassPathXmlApplicationContext("spring-configuracion/config-spring.xml");

		Persona p1 = new Persona(3, "new", "new");
		Persona p2 = new Persona(3, "update", "update");

		ServicioPersona sp = (ServicioPersona) contexto.getBean("servicioPersona2");

		sp.metodoDelServicio(p1, p2);
	}

}
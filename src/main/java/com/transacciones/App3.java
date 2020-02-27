package com.transacciones;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.transacciones.ejemplo_spring3.ServicioPersona;
import com.transacciones.modelo.Persona;

public class App3 {
	public static void main(String[] args) {
//		insertarPersona();
//		modificarPersona();
		guardar();
	}

	private static void guardar() {
		ApplicationContext contexto = new ClassPathXmlApplicationContext("spring-configuracion/config-spring.xml");

		Persona p = new Persona(6, "new", "new");

		ServicioPersona sp = (ServicioPersona) contexto.getBean("servicioPersona3");

		sp.guardar(p);
	}

}
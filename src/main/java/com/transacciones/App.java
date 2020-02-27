package com.transacciones;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.transacciones.ejemplo_spring.ServicioPersona;
import com.transacciones.modelo.Persona;

public class App {
	public static void main(String[] args) {
		case1();
	}

	private static void case1() {
		ApplicationContext contexto = new ClassPathXmlApplicationContext("spring-configuracion/config-spring.xml");

		Persona p1 = new Persona(55, "aaa", "aaa");
		Persona p2 = new Persona(1, "bbb", "bbb");

		ServicioPersona sp = (ServicioPersona) contexto.getBean("servicioPersona");

		sp.crearPersona(Arrays.asList(p1, p2));
	}
}

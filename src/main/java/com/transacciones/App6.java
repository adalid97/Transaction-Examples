package com.transacciones;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.transacciones.ejemplo_spring6_direccion.ServicioDireccion;
import com.transacciones.ejemplo_spring6_direccion.ServicioPersona;
import com.transacciones.excepciones.DireccionException;
import com.transacciones.modelo.Direccion;
import com.transacciones.modelo.Persona;

public class App6 {
	public static void main(String[] args) throws DireccionException {
		// insertarDireccion();
		// borrarDireccion();
		insertarPersona();
	}

	private static void insertarDireccion() throws DireccionException {
		ApplicationContext contexto = new ClassPathXmlApplicationContext("spring-configuracion/config-spring.xml");

		Direccion d1 = new Direccion(10, "a", 1, "41420", "", "Sevilla");

		ServicioDireccion sp = (ServicioDireccion) contexto.getBean("servicioDireccion");

		sp.crearDireccion(d1);
	}

	private static void borrarDireccion() {
		ApplicationContext contexto = new ClassPathXmlApplicationContext("spring-configuracion/config-spring.xml");

		Direccion d = new Direccion(1);

		ServicioDireccion sp = (ServicioDireccion) contexto.getBean("servicioDireccion");

		sp.borrarPersona(d);
	}

	private static void insertarPersona() throws DireccionException {
		ApplicationContext contexto = new ClassPathXmlApplicationContext("spring-configuracion/config-spring.xml");

		Direccion d = new Direccion(1, "a", 1, "", "Fuentes de Andalucía", "Sevilla");
		Persona p = new Persona(4, "Jose Angel", "Adalid López", d);

		ServicioPersona sp = (ServicioPersona) contexto.getBean("servicioPersona6");

		sp.crearPersona(p, d);
	}

}
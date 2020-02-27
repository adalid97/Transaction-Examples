package com.transacciones;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.transacciones.ejemplo_spring7_direccion.ServicioPersona;
import com.transacciones.excepciones.DirRunTimeException;
import com.transacciones.modelo.Direccion;
import com.transacciones.modelo.Persona;

public class App7 {
	public static void main(String[] args) throws DirRunTimeException {
		// insertarDireccion();
		// borrarDireccion();
		insertarPersona();
	}

	private static void insertarPersona() throws DirRunTimeException {
		ApplicationContext contexto = new ClassPathXmlApplicationContext("spring-configuracion/config-spring.xml");

		Direccion d = new Direccion(1, "a", 1, "", "Fuentes de Andalucía", "Sevilla");
		Persona p = new Persona(1, "Jose Angel", "Adalid López", d);

		ServicioPersona sp = (ServicioPersona) contexto.getBean("servicioPersona7");

		sp.crearPersona(p, d);
	}

}
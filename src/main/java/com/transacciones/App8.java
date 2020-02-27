package com.transacciones;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.transacciones.ejemplo_spring8_direccion.ServicioEliminarPersona;
import com.transacciones.modelo.Direccion;
import com.transacciones.modelo.Persona;

public class App8 {
	public static void main(String[] args) throws Exception {
		borrar();
	}

	private static void borrar() throws Exception {
		ApplicationContext contexto = new ClassPathXmlApplicationContext("spring-configuracion/config-spring.xml");

		Direccion d = new Direccion(1, "a", 1, "s", "Fuentes de Andalucía", "Sevilla");
		Persona p = new Persona(1, "Jose Angel", "Adalid López", d);

		ServicioEliminarPersona sp = (ServicioEliminarPersona) contexto.getBean("servicioPersona8");

		sp.eliminarPersona(p, d);
	}

}

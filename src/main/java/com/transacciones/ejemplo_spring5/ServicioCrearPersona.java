package com.transacciones.ejemplo_spring5;

import com.transacciones.excepciones.PersonaException;
import com.transacciones.modelo.Persona;

public interface ServicioCrearPersona {

	public void crearPersona(Persona p);

	public void guardar(Persona p1, Persona p2) throws PersonaException;

}

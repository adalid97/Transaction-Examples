package com.transacciones.ejemplo_spring4;

import com.transacciones.excepciones.PersonaException;
import com.transacciones.modelo.Persona;

public interface ServicioPersona {

	public void crearPersona(Persona p);

	public void modificarPersona(Persona p) throws PersonaException;

	public void guardar(Persona p1) throws PersonaException;

}

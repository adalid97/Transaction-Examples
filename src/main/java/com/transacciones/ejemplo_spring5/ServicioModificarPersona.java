package com.transacciones.ejemplo_spring5;

import com.transacciones.excepciones.PersonaException;
import com.transacciones.modelo.Persona;

public interface ServicioModificarPersona {

	public void modificarPersona(Persona p) throws PersonaException;

}

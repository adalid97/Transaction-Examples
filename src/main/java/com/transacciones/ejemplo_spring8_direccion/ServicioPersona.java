package com.transacciones.ejemplo_spring8_direccion;

import com.transacciones.excepciones.DirRunTimeException;
import com.transacciones.excepciones.PersonaException;
import com.transacciones.modelo.Direccion;
import com.transacciones.modelo.Persona;

public interface ServicioPersona {

	public void modificarPersona(Persona p) throws PersonaException;

	void crearPersona(Persona p, Direccion d) throws DirRunTimeException;

}

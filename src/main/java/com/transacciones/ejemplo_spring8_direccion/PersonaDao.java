package com.transacciones.ejemplo_spring8_direccion;

import com.transacciones.modelo.Persona;

public interface PersonaDao {

	public void modificarPersona(Persona p);

	void crearPersona(Persona p);

	public void eliminarPersona(Persona p);

}

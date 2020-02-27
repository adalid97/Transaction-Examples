package com.transacciones.ejemplo_spring7_direccion;

import com.transacciones.modelo.Persona;

public interface PersonaDao {

	public void modificarPersona(Persona p);

	void crearPersona(Persona p);

}

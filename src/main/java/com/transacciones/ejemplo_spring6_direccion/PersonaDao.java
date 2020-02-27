package com.transacciones.ejemplo_spring6_direccion;

import com.transacciones.modelo.Persona;

public interface PersonaDao {

	public void modificarPersona(Persona p);

	void crearPersona(Persona p);

}

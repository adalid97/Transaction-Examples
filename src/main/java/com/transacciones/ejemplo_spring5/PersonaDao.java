package com.transacciones.ejemplo_spring5;

import com.transacciones.modelo.Persona;

public interface PersonaDao {
	public void crearPersona(Persona p);

	public void modificarPersona(Persona p);

}

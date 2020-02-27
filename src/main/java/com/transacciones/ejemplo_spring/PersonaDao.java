package com.transacciones.ejemplo_spring;

import java.util.List;

import com.transacciones.modelo.Persona;

public interface PersonaDao {
	public void crearPersona(List<Persona> personas);
}

package com.transacciones.ejemplo_spring2;

import com.transacciones.modelo.Persona;

public interface ServicioPersona {

	public void crearPersona(Persona p);

	public void modificarPersona(Persona p);

	public void metodoDelServicio(Persona p1, Persona p2);

}

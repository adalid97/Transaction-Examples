package com.transacciones.ejemplo_spring3;

import com.transacciones.modelo.Persona;

public interface ServicioPersona {

	public void crearPersona(Persona p);

	public void modificarPersona(Persona p);

	public void guardar(Persona p1);

}

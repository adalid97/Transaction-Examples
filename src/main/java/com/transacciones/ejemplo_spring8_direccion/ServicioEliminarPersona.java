package com.transacciones.ejemplo_spring8_direccion;

import com.transacciones.modelo.Direccion;
import com.transacciones.modelo.Persona;

public interface ServicioEliminarPersona {
	public void eliminarPersona(Persona p, Direccion d) throws Exception;
}

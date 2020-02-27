package com.transacciones.ejemplo_spring8_direccion;

import com.transacciones.excepciones.DirRunTimeException;
import com.transacciones.modelo.Direccion;
import com.transacciones.modelo.Persona;

public interface ServicioDireccion {

	public void crearDireccion(Direccion d) throws DirRunTimeException;

	public void borrarPersona(Persona d);

}

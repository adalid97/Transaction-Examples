package com.transacciones.ejemplo_spring7_direccion;

import com.transacciones.excepciones.DirRunTimeException;
import com.transacciones.modelo.Direccion;

public interface ServicioDireccion {

	public void crearDireccion(Direccion d) throws DirRunTimeException;

	public void borrarPersona(Direccion d);

}

package com.transacciones.ejemplo_spring6_direccion;

import com.transacciones.excepciones.DireccionException;
import com.transacciones.modelo.Direccion;

public interface ServicioDireccion {

	public void crearDireccion(Direccion d) throws DireccionException;

	public void borrarPersona(Direccion d);

}

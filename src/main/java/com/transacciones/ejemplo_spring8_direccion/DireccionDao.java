package com.transacciones.ejemplo_spring8_direccion;

import com.transacciones.modelo.Direccion;

public interface DireccionDao {
	public void crearDireccion(Direccion d);

	public void borrarDireccion(Direccion d);
}

package com.transacciones.ejemplo_spring6_direccion;

import org.springframework.transaction.annotation.Transactional;

import com.transacciones.excepciones.DireccionException;
import com.transacciones.modelo.Direccion;

public class ServicioDireccionImpl implements ServicioDireccion {

	private DireccionDao dao;

	@Override
	@Transactional
	public void crearDireccion(Direccion d) throws DireccionException {

		if (d.getId() == 0 || d.getCodigoPostal().isEmpty() || d.getDireccion().isEmpty() || d.getProvincia().isEmpty()
				|| d.getNumero() == 0 || d.getCiudad().isEmpty()) {
			throw new DireccionException();
		}
		dao.crearDireccion(d);
	}

	@Override
	public void borrarPersona(Direccion d) {
		dao.borrarPersona(d);
	}

	public void setDao(DireccionDao dao) {
		this.dao = dao;
	}
}

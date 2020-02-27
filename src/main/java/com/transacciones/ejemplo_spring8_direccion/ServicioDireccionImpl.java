package com.transacciones.ejemplo_spring8_direccion;

import org.springframework.transaction.annotation.Transactional;

import com.transacciones.excepciones.DirRunTimeException;
import com.transacciones.modelo.Direccion;
import com.transacciones.modelo.Persona;

public class ServicioDireccionImpl implements ServicioDireccion {

	private DireccionDao dao;

	@Override
	@Transactional
	public void crearDireccion(Direccion d) throws DirRunTimeException {

		if (d.getId() == 0 || d.getCodigoPostal().isEmpty() || d.getDireccion().isEmpty() || d.getProvincia().isEmpty()
				|| d.getNumero() == 0 || d.getCiudad().isEmpty()) {
			throw new DirRunTimeException();
		}
		dao.crearDireccion(d);
	}

	@Override
	public void borrarPersona(Persona d) {

	}

	public void setDao(DireccionDao dao) {
		this.dao = dao;
	}
}

package com.transacciones.ejemplo_spring5;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.transacciones.excepciones.PersonaException;
import com.transacciones.modelo.Persona;

public class ServicioModificarPersonaImpl implements ServicioModificarPersona {

	private PersonaDao dao;

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void modificarPersona(Persona p) throws PersonaException {
		dao.modificarPersona(p);
	}

	public void setDao(PersonaDao dao) {
		this.dao = dao;
	}

}

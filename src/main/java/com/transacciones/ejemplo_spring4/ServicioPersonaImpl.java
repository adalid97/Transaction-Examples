package com.transacciones.ejemplo_spring4;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.transacciones.excepciones.PersonaException;
import com.transacciones.modelo.Persona;

public class ServicioPersonaImpl implements ServicioPersona {

	private PersonaDao dao;

	@Override
	@Transactional
	public void crearPersona(Persona p) {
		dao.crearPersona(p);
	}

	@Override
	@Transactional
	public void modificarPersona(Persona p) throws PersonaException {
		dao.modificarPersona(p);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void guardar(Persona p1) throws PersonaException {
		dao.crearPersona(p1);
		dao.modificarPersona(p1);

		if ("Error".equals(p1.getApellidos())) {
			throw new RuntimeException();
		}
		if ("Error_2".equals(p1.getApellidos())) {
			throw new PersonaException();
		}

	}

	public void setDao(PersonaDao dao) {
		this.dao = dao;
	}

}

package com.transacciones.ejemplo_spring3;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.transacciones.modelo.Persona;

public class ServicioPersonaImpl implements ServicioPersona {

	private PersonaDao dao;

	@Override
	@Transactional(propagation = Propagation.MANDATORY)
	public void crearPersona(Persona p) {
		dao.crearPersona(p);
	}

	@Override
	@Transactional
	public void modificarPersona(Persona p) {
		dao.modificarPersona(p);
	}

	@Override
	@Transactional()
	public void guardar(Persona p1) {
		dao.crearPersona(p1);
		dao.modificarPersona(p1);
	}

	public void setDao(PersonaDao dao) {
		this.dao = dao;
	}

}

package com.transacciones.ejemplo_spring2;

import org.springframework.transaction.annotation.Transactional;

import com.transacciones.modelo.Persona;

@Transactional
public class ServicioPersonaImpl implements ServicioPersona {

	private PersonaDao dao;

	@Override
	public void crearPersona(Persona p) {
		dao.crearPersona(p);
	}

	@Override
	public void modificarPersona(Persona p) {
		dao.modificarPersona(p);
	}

	@Override
	public void metodoDelServicio(Persona p1, Persona p2) {
		dao.crearPersona(p1);
		dao.modificarPersona(p2);
	}

	public void setDao(PersonaDao dao) {
		this.dao = dao;
	}

}

package com.transacciones.ejemplo_spring;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.transacciones.modelo.Persona;

public class ServicioPersonaImpl implements ServicioPersona {

	private PersonaDao dao;

	@Override
	@Transactional
	public void crearPersona(List<Persona> personas) {
		dao.crearPersona(personas);
	}

	public void setDao(PersonaDao dao) {
		this.dao = dao;
	}

}

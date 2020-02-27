package com.transacciones.ejemplo_spring5;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.transacciones.excepciones.PersonaException;
import com.transacciones.modelo.Persona;

public class ServicioCrearPersonaImpl implements ServicioCrearPersona {

	private PersonaDao dao;
	private ServicioModificarPersona servicioModificar;

	@Override
	@Transactional
	public void crearPersona(Persona p) {
		dao.crearPersona(p);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void guardar(Persona p1, Persona p2) throws PersonaException {
		try {
			dao.crearPersona(p1);
			servicioModificar.modificarPersona(p2);

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void setDao(PersonaDao dao) {
		this.dao = dao;
	}

	public void setServicioModificar(ServicioModificarPersona servicioModificar) {
		this.servicioModificar = servicioModificar;
	}

}

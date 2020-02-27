package com.transacciones.ejemplo_spring6_direccion;

import org.springframework.beans.BeansException;
import org.springframework.transaction.annotation.Transactional;

import com.transacciones.excepciones.DireccionException;
import com.transacciones.excepciones.PersonaException;
import com.transacciones.modelo.Direccion;
import com.transacciones.modelo.Persona;

public class ServicioPersonaImpl implements ServicioPersona {

	private PersonaDao dao;
	private ServicioDireccion sd;

	public ServicioDireccion getSd() {
		return sd;
	}

	public void setSd(ServicioDireccion sd) {
		this.sd = sd;
	}

	public PersonaDao getDao() {
		return dao;
	}

	@Override
	@Transactional(rollbackFor = DireccionException.class)
	public void crearPersona(Persona p, Direccion d) throws DireccionException, BeansException {
		dao.crearPersona(p);

		try {
			sd.crearDireccion(d);
		} catch (DireccionException e) {
			throw e;
		}

	}

	@Override
	@Transactional
	public void modificarPersona(Persona p) throws PersonaException {
		dao.modificarPersona(p);
	}

	public void setDao(PersonaDao dao) {
		this.dao = dao;
	}

}

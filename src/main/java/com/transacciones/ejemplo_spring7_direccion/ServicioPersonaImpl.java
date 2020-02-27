package com.transacciones.ejemplo_spring7_direccion;

import org.springframework.transaction.annotation.Transactional;

import com.transacciones.excepciones.DirRunTimeException;
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
	@Transactional(noRollbackFor = DirRunTimeException.class)
	public void crearPersona(Persona p, Direccion d) throws DirRunTimeException {
		dao.crearPersona(p);

		try {
			sd.crearDireccion(d);
		} catch (DirRunTimeException e) {
			System.out.println("Faltan datos");
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

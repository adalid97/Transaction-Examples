package com.transacciones.ejemplo_spring6_direccion;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.transacciones.modelo.Persona;

public class PersonaDaoImpl implements PersonaDao {

	private DataSource dataSources;

	@Override
	public void crearPersona(Persona p) {

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSources);

		jdbcTemplate.update("INSERT INTO PERSONA VALUES (?,?,?)",
				new Object[] { p.getId(), p.getNombre(), p.getApellidos() });

	}

	@Override
	public void modificarPersona(Persona p) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSources);

		jdbcTemplate.update("UPDATE persona SET nombre=?, apellidos= ? WHERE id=?", p.getNombre(), p.getApellidos(),
				p.getId());

	}

	public void setDataSources(DataSource dataSources) {
		this.dataSources = dataSources;
	}

}

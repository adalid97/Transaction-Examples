package com.transacciones.ejemplo_spring;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.transacciones.modelo.Persona;

public class PersonaDaoImpl implements PersonaDao {

	private DataSource dataSources;

	@Override
	public void crearPersona(List<Persona> personas) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSources);

		personas.stream().forEach(p -> jdbcTemplate.update("INSERT INTO PERSONA VALUES (?,?,?)",
				new Object[] { p.getId(), p.getNombre(), p.getApellidos() }));

	}

	public void setDataSources(DataSource dataSources) {
		this.dataSources = dataSources;
	}

}

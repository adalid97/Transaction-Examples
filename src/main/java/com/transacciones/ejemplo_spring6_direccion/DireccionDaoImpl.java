package com.transacciones.ejemplo_spring6_direccion;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.transacciones.modelo.Direccion;

public class DireccionDaoImpl implements DireccionDao {

	private DataSource dataSources;

//	@Override
//	public void crearPersona(Persona p) {
//
//		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSources);
//
//		jdbcTemplate.update("INSERT INTO PERSONA VALUES (?,?,?)",
//				new Object[] { p.getId(), p.getNombre(), p.getApellidos() });
//
//	}
//
//	@Override
//	public void modificarPersona(Persona p) {
//		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSources);
//
//		jdbcTemplate.update("UPDATE persona SET nombre=?, apellidos= ? WHERE id=?", p.getNombre(), p.getApellidos(),
//				p.getId());
//
//	}

	public void setDataSources(DataSource dataSources) {
		this.dataSources = dataSources;
	}

	@Override
	public void crearDireccion(Direccion d) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSources);

		jdbcTemplate.update("INSERT INTO direccion VALUES (?,?,?,?,?,?)", d.getId(), d.getDireccion(), d.getNumero(),
				d.getCodigoPostal(), d.getCiudad(), d.getProvincia());

	}

	@Override
	public void borrarPersona(Direccion d) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSources);

		jdbcTemplate.update("DELETE FROM direccion WHERE id=?", d.getId());

	}

}

package com.transacciones.ejemplo_spring7_direccion;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.transacciones.modelo.Direccion;

public class DireccionDaoImpl implements DireccionDao {

	private DataSource dataSources;

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

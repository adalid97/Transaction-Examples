package com.transacciones.ejemplo_spring8_direccion;

import javax.sql.DataSource;

import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.transacciones.modelo.Direccion;
import com.transacciones.modelo.Persona;

public class ServicioEliminarPersonaImpl implements ServicioEliminarPersona {

	private PersonaDao daoPersona;
	private DireccionDao daoDireccion;
	private DataSource dataSource;
	private PlatformTransactionManager transactionManager;

	@Override
	public void eliminarPersona(Persona p, Direccion d) throws Exception {
		DefaultTransactionDefinition def = new DefaultTransactionDefinition();

		def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);

		TransactionStatus status = transactionManager.getTransaction(def);
		try {

			daoDireccion.borrarDireccion(d);
			daoPersona.eliminarPersona(p);

			if (p.getId() == 1) {
				throw new Exception();
			}
			transactionManager.commit(status);

		} catch (Exception e) {
			transactionManager.rollback(status);
			throw e;
		}

	}

	public PersonaDao getDaoPersona() {
		return daoPersona;
	}

	public void setDaoPersona(PersonaDao daoPersona) {
		this.daoPersona = daoPersona;
	}

	public DireccionDao getDaoDireccion() {
		return daoDireccion;
	}

	public void setDaoDireccion(DireccionDao daoDireccion) {
		this.daoDireccion = daoDireccion;
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public PlatformTransactionManager getTransactionManager() {
		return transactionManager;
	}

	public void setTransactionManager(PlatformTransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}

}

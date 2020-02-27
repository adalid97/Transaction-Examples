package com.transacciones.ejemplosJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.transacciones.conexion.DataBase;

public class MainPersona {
	public static void main(String[] args) throws SQLException {

//		insertaPersona(13, "Joaquin", "Alvarez Alvarez");
//		insertaPersona(14, "Joaquin", "Alvarez Alvarez");
//		insertaPersona(14, "Joaquin", "Alvarez Alvarez");
//		actualizarPersona(7, "Jose Angel", "Adalid");
//		borrarPersona(7);
		insertaVariasPersonasOK();
		insertaVariasPersonasNoOK();
	}

	public static void insertaPersona(int id, String nombre, String apellidos) throws SQLException {
		Connection a = DataBase.getConection();
		PreparedStatement statement = null;
		try {
			a.setAutoCommit(false);
			String sql = "INSERT INTO persona (id, nombre, apellidos) VALUE (" + id + ",'" + nombre + "','" + apellidos
					+ "')";
			statement = a.prepareStatement(sql);

			int rowsInserted = statement.executeUpdate();
			a.commit();
			if (rowsInserted > 0) {
				System.out.println("Persona insertada!");
			}

		} catch (Exception e) {
			a.rollback();
			System.out.println("Error al insertar.");
		} finally {
			a.close();
			statement.close();
		}

	}

	public static void actualizarPersona(int id, String nombre, String apellidos) throws SQLException {
		Connection a = DataBase.getConection();
		PreparedStatement statement = null;

		try {

			String sql = "UPDATE persona SET nombre='" + nombre + "', apellidos= '" + apellidos + "' WHERE id=" + id
					+ "";
			statement = a.prepareStatement(sql);

			int rowsInserted = statement.executeUpdate();
			if (rowsInserted > 0) {
				System.out.println("Persona actualizada!");
			}
		} catch (Exception e) {
			System.out.println("Error al actualizar.");
		} finally {
			a.close();
			statement.close();
		}

	}

	public static void borrarPersona(int id) throws SQLException {
		Connection a = DataBase.getConection();
		PreparedStatement statement = null;
		try {

			String sql = "DELETE FROM persona WHERE id=" + id + " ";
			statement = a.prepareStatement(sql);

			int rowsDeleted = statement.executeUpdate();
			if (rowsDeleted > 0) {
				System.out.println("Registro eliminado!");
			}
		} catch (Exception e) {
			System.out.println("Error al borrar.");
		} finally {
			a.close();
			statement.close();
		}

	}

	public static void insertaVariasPersonasOK() throws SQLException {
		Connection a = DataBase.getConection();
		PreparedStatement statement1 = null;
		PreparedStatement statement2 = null;
		PreparedStatement statement3 = null;
		try {
			a.setAutoCommit(false);
			String sql = "INSERT INTO persona (id, nombre, apellidos) VALUE (31, 'Jose', 'Ada')";
			statement1 = a.prepareStatement(sql);
			statement1.executeUpdate();
			String sql2 = "INSERT INTO persona (id, nombre, apellidos) VALUE (32, 'Jose', 'Ada')";
			statement2 = a.prepareStatement(sql2);
			statement2.executeUpdate();
			String sql3 = "INSERT INTO persona (id, nombre, apellidos) VALUE (33, 'Jose', 'Ada')";
			statement3 = a.prepareStatement(sql3);
			statement3.executeUpdate();
			a.commit();

		} catch (Exception e) {
			a.rollback();
			System.out.println("Error al insertar.");
		} finally {
			a.close();
			statement1.close();
			statement2.close();
			statement3.close();
		}

	}

	public static void insertaVariasPersonasNoOK() throws SQLException {
		Connection a = DataBase.getConection();
		PreparedStatement statement1 = null;
		PreparedStatement statement2 = null;
		PreparedStatement statement3 = null;
		try {
			a.setAutoCommit(false);
			String sql = "INSERT INTO persona (id, nombre, apellidos) VALUE (41, 'Jose', 'Ada')";
			statement1 = a.prepareStatement(sql);
			statement1.executeUpdate();
			String sql2 = "INSERT INTO persona (id, nombre, apellidos) VALUE (42, 'Jose', 'Ada')";
			statement2 = a.prepareStatement(sql2);
			statement2.executeUpdate();
			String sql3 = "INSERT INTO persona (id, nombre, apellidos) VALUE (42, 'Jose', 'Ada')";
			statement3 = a.prepareStatement(sql3);
			statement3.executeUpdate();
			a.commit();

		} catch (Exception e) {
			a.rollback();
			System.out.println("Error al insertar.");
		} finally {
			a.close();
			statement1.close();
			statement2.close();
			statement3.close();
		}

	}
}

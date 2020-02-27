package com.transacciones.modelo;

public class Direccion {
	private int id;
	private String direccion;
	private int numero;
	private String codigoPostal;
	private String ciudad;
	private String provincia;

	public Direccion() {
		super();
	}

	public Direccion(int id, String direccion, int numero, String codigoPostal, String ciudad, String provincia) {
		super();
		this.id = id;
		this.direccion = direccion;
		this.numero = numero;
		this.codigoPostal = codigoPostal;
		this.ciudad = ciudad;
		this.provincia = provincia;
	}

	public Direccion(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

}

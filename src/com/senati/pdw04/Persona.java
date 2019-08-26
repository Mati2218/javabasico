package com.senati.pdw04;

public class Persona {
	
	int id;
	String nombre;
	String apellido;
	String sexo;
	String fechanac;
	
	
	public Persona(int id, String nombre, String apellido, String sexo, String fechanac) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.fechanac = fechanac;
	}
	//Constructor que no recibe parametros

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getFechanac() {
		return fechanac;
	}

	public void setFechanac(String fechanac) {
		this.fechanac = fechanac;
	}
	
	
	@Override
	public String toString() {
		return "Celular [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ",sexo=" + sexo + ",fechanac=" + fechanac + "]";
	}
	
}
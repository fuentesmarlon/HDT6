package org.uvg.beans;

public class Desarrollador {
	private int carne;
	private String nombre;
	private boolean web;
	private boolean java;
	private boolean movil;
	
	public Desarrollador(int carne, String nombre, boolean web, boolean java, boolean movil) {
		super();
		this.carne = carne;
		this.nombre = nombre;
		this.web = web;
		this.java = java;
		this.movil = movil;
	}
	public Desarrollador() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCarne() {
		return carne;
	}
	public void setCarne(int carne) {
		this.carne = carne;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isWeb() {
		return web;
	}
	public void setWeb(boolean web) {
		this.web = web;
	}
	public boolean isJava() {
		return java;
	}
	public void setJava(boolean java) {
		this.java = java;
	}
	public boolean isMovil() {
		return movil;
	}
	public void setMovil(boolean movil) {
		this.movil = movil;
	}
	
	
}

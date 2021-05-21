package com.mx.factory;

public abstract class Computadora {
	
	private String modelo;
	private double costo;
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getCosto() {
		return costo;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
	
	public abstract double getCostoTotal();
	@Override
	public String toString() {
		return "Computadora [modelo=" + modelo + ", costo=" + costo + "]";
	}
}

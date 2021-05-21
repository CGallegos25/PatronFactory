package com.mx.factory;

public class ComputadoraTotalDescuento extends Computadora{

	@Override
	public double getCostoTotal() {
		return getCosto()-100;
	}

}

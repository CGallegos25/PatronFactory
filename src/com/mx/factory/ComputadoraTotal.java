package com.mx.factory;

public class ComputadoraTotal  extends Computadora{

	@Override
	public double getCostoTotal() {
		return getCosto()+200;
	}

}

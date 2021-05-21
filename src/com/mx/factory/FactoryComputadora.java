package com.mx.factory;

public class FactoryComputadora {
	
	public static Computadora getComputadora(String modelo) {
		if(modelo.contentEquals("PC")) {
			return new ComputadoraTotal();
		} else {
			return new ComputadoraTotalDescuento();
		}
	}
}

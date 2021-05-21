package com.mx.main;

import com.mx.factory.Computadora;
import com.mx.factory.FactoryComputadora;

public class MainFactory {
	
	public static void main(String[] rgs) {
		Computadora c = FactoryComputadora.getComputadora("Laptop");
		c.setModelo("Dell");
		c.setCosto(20000);
		System.out.println("Valor del objeto factory: " + c.getCostoTotal());
	}
}

package main;

import logicadenegocios.VegetalFactory;
import logicadenegocios.CarneFactory;
import logicadenegocios.Alimento;

public class ClienteSimpleFactory {
	
	private static VegetalFactory fabricaV = new VegetalFactory();
	private static CarneFactory fabricaC = new CarneFactory();

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
	  Alimento alimentoC;
	  alimentoC = fabricaC.crearAlimento();
	  alimentoC.producir();
	  
	  Alimento alimentoV;
	  alimentoV = fabricaV.crearAlimento();
	  alimentoV.producir();
	}

}

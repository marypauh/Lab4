package main;

import logicadenegocios.SimpleVehiculoFactory;
import logicadenegocios.Vehiculo;

public class ClienteSimpleFactory {
	
	private static SimpleVehiculoFactory factory = new SimpleVehiculoFactory();

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
	  Vehiculo vehiculo;
	  vehiculo = factory.crearVehiculo("Terrestre");
	  vehiculo.producir();

	}

}

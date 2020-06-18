package logicadenegocios;

public class VehiculoStore {
	
	private SimpleVehiculoFactory fabrica;
	
	public VehiculoStore(SimpleVehiculoFactory pFabrica) {
		fabrica = pFabrica; 	
	}
	
	public Vehiculo encargarVehiculo(String pTipo) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
	  Vehiculo vehiculo;
	  vehiculo = fabrica.crearVehiculo(pTipo);
	  vehiculo.producir();
	  return vehiculo;
	}
	

}

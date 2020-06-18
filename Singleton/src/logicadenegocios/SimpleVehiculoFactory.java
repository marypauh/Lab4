package logicadenegocios;

public class SimpleVehiculoFactory  {
	
	public Vehiculo crearVehiculo(String pTipo) throws ClassNotFoundException, InstantiationException,
	IllegalAccessException {
		
		Vehiculo vehiculo = null;
		vehiculo = (Vehiculo) Class.forName(pTipo).newInstance();
		
		return vehiculo;
		
	} 

}

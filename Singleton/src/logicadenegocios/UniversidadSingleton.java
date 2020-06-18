package logicadenegocios;

public class UniversidadSingleton {
	
	private static Universidad instancia = new Universidad();
	
	private UniversidadSingleton() {}
	
	public static Universidad obtenerInstancia() {
		
	  return instancia;	
	}

}

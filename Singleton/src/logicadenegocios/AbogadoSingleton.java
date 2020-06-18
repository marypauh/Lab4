package logicadenegocios;

public class AbogadoSingleton {
	
	private static Abogado instancia = new Abogado();
	
	private AbogadoSingleton() {
		
	}
	
	public Abogado obtenerInstancia() {
	return instancia;
	}
	
}

package main;

import logicadenegocios.Abogado;
import logicadenegocios.AbogadoSingleton;
import logicadenegocios.Universidad;
import logicadenegocios.UniversidadSingleton;

public class main {

	public static void main(String[] args) {
		Abogado abogado = AbogadoSingleton.obtenerInstancia();
		abogado.casar("Carlos", "Sofia");
		abogado.divorciar("Marta", "Pablo");
		
		Universidad universidad = UniversidadSingleton.obtenerInstancia();
		universidad.graduar("Valeria");
		universidad.reprobrar("Kevin");
	}

}

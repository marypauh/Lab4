package main;

import logicadenegocios.Abogado;
import logicadenegocios.AbogadoSingleton;

public class main {

	public static void main(String[] args) {
		Abogado abogado = AbogadoSingleton.obtenerInstancia();
		abogado.casar("Carlos", "Sofia");
		abogado.divorciar("Marta", "Pablo");
	}

}

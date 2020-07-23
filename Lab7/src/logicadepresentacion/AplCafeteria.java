package logicadepresentacion;

import logicadenegocios.Cafeteria;
import logicadenegocios.ChocolateCaliente;
import logicadenegocios.ExtraLecheDecorador;
import logicadenegocios.Frappucino;

public class AplCafeteria {

	public static void main(String[] args) {
		Cafeteria frap = new Frappucino();
		Cafeteria frapExtra = new ExtraLecheDecorador(new Frappucino());
		Cafeteria chocolateExtra = new ExtraLecheDecorador(new ChocolateCaliente());
		
		System.out.println("Frappucino normal");
		frap.obtenerPrecio();
		
		System.out.println("Frappucino con leche extra");
		frapExtra.obtenerPrecio();
		
		System.out.println("Chocolate caliente con leche extra");
		chocolateExtra.obtenerPrecio();
	}

}

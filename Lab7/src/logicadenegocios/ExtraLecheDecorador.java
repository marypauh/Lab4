package logicadenegocios;

public class ExtraLecheDecorador extends CafeteriaDecorador{

	public ExtraLecheDecorador(Cafeteria pCafeteriaDecorador) {
		super(pCafeteriaDecorador);
	}

	@Override
	public void obtenerPrecio() {
		cafeteriaDecorador.obtenerPrecio();
		agregarExtra(cafeteriaDecorador);
	}
	
	
	private void agregarExtra(Cafeteria pCafeteriaDecorador) {
		System.out.println("Se agregó el extra de leche");
	}

}

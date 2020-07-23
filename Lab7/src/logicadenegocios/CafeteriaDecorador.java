package logicadenegocios;

public abstract class CafeteriaDecorador implements Cafeteria{
	protected Cafeteria cafeteriaDecorador;

	public CafeteriaDecorador(Cafeteria pCafeteriaDecorador) {
		cafeteriaDecorador = pCafeteriaDecorador;
		
	}

	@Override
	public void obtenerPrecio() {
		cafeteriaDecorador.obtenerPrecio();
		
	}
	
	
}

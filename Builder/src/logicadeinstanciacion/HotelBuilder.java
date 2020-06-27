package logicadeinstanciacion;
import logicadenegocios.Hotel;

public class HotelBuilder implements Builder{
	private Hotel resultado;

	@Override
	public void reiniciar() {
		resultado = new Hotel();
		
	}

	@Override
	public void construirCuarto(int pNumeroCuartos) {
		resultado.setCantidadCuartos(pNumeroCuartos);
		
	}

	@Override
	public void construirBa�o(int pNumeroBa�os) {
		resultado.setCantidadBa�os(pNumeroBa�os);
		
	}

	@Override
	public void construirRestaurante(int pNumeroRestaurantes) {
		resultado.setCantidadRestaurantes(pNumeroRestaurantes);
		
	}
	
	public void construirPiscina(int pNumeroPiscinas) {
		resultado.setCantidadPiscinas(pNumeroPiscinas);
		
	}
	
	public Hotel getResult() {
		return resultado;
	}

}

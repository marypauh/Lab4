package logicadenegocios;

import logicadeinstanciacion.Builder;

public class CasaBuilder implements Builder{
	private Casa resultado;

	@Override
	public void reiniciar() {
		resultado = new Casa();
		
	}

	@Override
	public void construirCuarto(int pNumCuartos) {
		resultado.setCuartos(pNumCuartos);
		
	}

	@Override
	public void construirBaņo(int pNumBaņos) {
		resultado.setBanos(pNumBaņos);
		
	}

	@Override
	public void construirGaraje(int pNumGarajes) {
		resultado.setGarajes(pNumGarajes);
		
	}
	
	public Casa getResult() {
		return resultado;
	}

}

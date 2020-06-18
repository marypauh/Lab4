package logicadenegocios;

public class AlimentoStore {
	private AlimentoFactory fabrica;
	
	public AlimentoStore(AlimentoFactory pFabrica) {
		fabrica = pFabrica;
		
	}
	
	public Alimento solicitarAlimento() {
		Alimento alimento;
		alimento = fabrica.crearAlimento();
		alimento.producir();
		return alimento;
	}

}

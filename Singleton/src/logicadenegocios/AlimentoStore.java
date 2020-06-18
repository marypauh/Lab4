package logicadenegocios;

public class AlimentoStore {
	
	private SimpleAlimentoFactory fabrica;
	
	public AlimentoStore(SimpleAlimentoFactory pFabrica) {
		fabrica = pFabrica;
	}
	
	public Alimento solicitarAlimento(String pTipo) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		  Alimento alimento;
		  alimento = fabrica.crearAlimento(pTipo);
		  alimento.producir();
		  return alimento;
		}

}

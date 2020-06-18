package logicadenegocios;

public class SimpleAlimentoFactory {
	
	public Alimento crearAlimento(String pTipo) throws ClassNotFoundException, InstantiationException,
	IllegalAccessException {
		
		Alimento alimento = null;
		alimento = (Alimento) Class.forName(pTipo).newInstance();
		
		return alimento;
	}

}

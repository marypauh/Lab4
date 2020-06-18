package logicadenegocios;

public class CarneFactory extends AlimentoFactory{

	@Override
	public Alimento crearAlimento() {
		Alimento carne = new Carne();
		return carne;
	}
	
	

}

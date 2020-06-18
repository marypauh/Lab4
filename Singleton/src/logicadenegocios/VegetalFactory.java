package logicadenegocios;

public class VegetalFactory extends AlimentoFactory{

	@Override
	public Alimento crearAlimento() {
		Alimento vegetal = new Vegetal();
		return vegetal;
	}

}

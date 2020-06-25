package logicadeinstanciacion;

public class Director {
	private Builder builder;
	

	public Director(Builder pBuilder) {
		builder = pBuilder;
	}
	
	public void hacerCasaHabitacion() {
		builder.reiniciar();
		builder.construirCuarto(3);
		builder.construirBa�o(3);
		builder.construirGaraje(2);
	}
	
	public void hacerOficina() {
		builder.reiniciar();
		builder.construirCuarto(12);
		builder.construirBa�o(8);
		builder.construirGaraje(10);
	}
}

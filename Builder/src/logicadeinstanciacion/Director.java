package logicadeinstanciacion;

public class Director {
	private Builder builder;
	

	public Director(Builder pBuilder) {
		builder = pBuilder;
	}
	
	public void hacerHotelFamiliar() {
		builder.reiniciar();
		builder.construirCuarto(45);
		builder.construirBaño(15);
		builder.construirPiscina(3);
		builder.construirRestaurante(2);
	}
	
	public void hacerHotelRomantico() {
		builder.reiniciar();
		builder.construirCuarto(60);
		builder.construirBaño(20);
		builder.construirPiscina(4);
		builder.construirRestaurante(5);
	}
	
	public void hacerHotelLujoso() {
		builder.reiniciar();
		builder.construirCuarto(145);
		builder.construirBaño(30);
		builder.construirPiscina(8);
		builder.construirRestaurante(10);
	}
}

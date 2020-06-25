package main;
import logicadeinstanciacion.Director;
import logicadenegocios.Hotel;
import logicadenegocios.HotelBuilder;

public class Cliente {

	public static void main(String[] args) {
		HotelBuilder hotelBuilder = new HotelBuilder();
		Director director = new Director(hotelBuilder);
		
		director.hacerHotelFamiliar();
		Hotel hotelFamiliar = hotelBuilder.getResult();
		
		director.hacerHotelLujoso();
		Hotel hotelLujoso =  hotelBuilder.getResult();
		
		director.hacerHotelRomantico();
		Hotel hotelRomantico = hotelBuilder.getResult();
		
		System.out.println("Hotel familiaar");
		System.out.println("La cantidad de cuartos son: "+hotelFamiliar.getCantidadCuartos());
		System.out.println("La cantidad de ba�os son: "+hotelFamiliar.getCantidadBa�os());
		System.out.println("La cantidad de piscinas son: "+hotelFamiliar.getCantidadPiscinas());
		System.out.println("La cantidad de restaurantes son: "+hotelFamiliar.getCantidadRestaurantes());
		
		System.out.println("Hotel lujoso");
		System.out.println("La cantidad de cuartos son: "+hotelLujoso.getCantidadCuartos());
		System.out.println("La cantidad de ba�os son: "+hotelLujoso.getCantidadBa�os());
		System.out.println("La cantidad de piscinas son: "+hotelLujoso.getCantidadPiscinas());
		System.out.println("La cantidad de restaurantes son: "+hotelLujoso.getCantidadRestaurantes());
		
		System.out.println("Hotel rom�ntico ");
		System.out.println("La cantidad de cuartos son: "+hotelRomantico.getCantidadCuartos());
		System.out.println("La cantidad de ba�os son: "+hotelRomantico.getCantidadBa�os());
		System.out.println("La cantidad de piscinas son: "+hotelRomantico.getCantidadPiscinas());
		System.out.println("La cantidad de restaurantes son: "+hotelRomantico.getCantidadRestaurantes());

		
	}

}

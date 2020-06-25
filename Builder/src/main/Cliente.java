package main;

import logicadeinstanciacion.Director;
import logicadenegocios.Casa;
import logicadenegocios.CasaBuilder;

public class Cliente {

	public static void main(String[] args) {
		CasaBuilder casaBuilder = new CasaBuilder();
		Director director = new Director(casaBuilder);
		
		director.hacerCasaHabitacion();
		Casa casaHabitacion = casaBuilder.getResult();
		
		director.hacerOficina();
		Casa oficina =  casaBuilder.getResult();
		
		System.out.println("Casa de Habitación");
		System.out.println(casaHabitacion.getCuartos());
		System.out.println(casaHabitacion.getBanos());
		System.out.println(casaHabitacion.getGarajes());
		
		System.out.println("Oficina");
		System.out.println(oficina.getCuartos());
		System.out.println(oficina.getBanos());
		System.out.println(oficina.getGarajes());
	}

}

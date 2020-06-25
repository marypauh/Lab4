package main;
import logicanegocios.RealizarDeposito;
import logicanegocios.RealizarRetiro;
import logicainstanciacion.Contexto;

import logicainstanciacion.CuentaBancariaStrategy;

public class Cliente {
	
	public static void main(String[] args) {
		CuentaBancariaStrategy cuentaBancariaStrategyDepositar = new RealizarRetiro();
		CuentaBancariaStrategy cuentaBancariaStrategyRetirar = new RealizarDeposito();
		
		Contexto contexto = new Contexto(cuentaBancariaStrategyDepositar);
		contexto.ejecutarOperacionBancaria("117654788", 470000);
		
		contexto = new Contexto(cuentaBancariaStrategyRetirar);
		contexto.ejecutarOperacionBancaria("1478522345", 15000);
	}
	

}

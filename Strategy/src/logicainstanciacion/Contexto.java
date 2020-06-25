package logicainstanciacion;

public class Contexto {
	
	private CuentaBancariaStrategy cuentaBancariaStrategy;
	
	public Contexto(CuentaBancariaStrategy pCuentaBancariaStrategy) {
		cuentaBancariaStrategy = pCuentaBancariaStrategy;
	}
	
	public void ejecutarOperacionBancaria(String pCuenta, int pMonto) {
		cuentaBancariaStrategy.realizarOperacionBancaria(pCuenta, pMonto);
		
	}

}

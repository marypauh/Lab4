package logicanegocios;
import logicainstanciacion.CuentaBancariaStrategy;

public class RealizarRetiro implements CuentaBancariaStrategy {
	
	public void realizarOperacionBancaria(String pCuenta,int pMonto) {
		System.out.println("Se realiz� un retiro de "+pMonto+ " al n�mero de cuenta "+pCuenta );
	}

}

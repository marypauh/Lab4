package logicanegocios;
import logicainstanciacion.CuentaBancariaStrategy;

public class RealizarDeposito implements CuentaBancariaStrategy {

	public void realizarOperacionBancaria(String pCuenta,int pMonto) {
		System.out.println("Se realiz� una transferencia de "+pMonto+ " al n�mero de cuenta "+pCuenta );
	}

}

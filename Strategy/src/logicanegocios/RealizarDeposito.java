package logicanegocios;
import logicainstanciacion.CuentaBancariaStrategy;

public class RealizarDeposito implements CuentaBancariaStrategy {

	public void realizarOperacionBancaria(String pCuenta,int pMonto) {
		System.out.println("Se realizó una transferencia de "+pMonto+ " al número de cuenta "+pCuenta );
	}

}

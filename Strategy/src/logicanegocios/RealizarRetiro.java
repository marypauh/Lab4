package logicanegocios;
import logicainstanciacion.CuentaBancariaStrategy;

public class RealizarRetiro implements CuentaBancariaStrategy {
	
	public void realizarOperacionBancaria(String pCuenta,int pMonto) {
		System.out.println("Se realizó un retiro de "+pMonto+ " al número de cuenta "+pCuenta );
	}

}

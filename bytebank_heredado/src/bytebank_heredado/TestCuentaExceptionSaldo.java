package bytebank_heredado;

public class TestCuentaExceptionSaldo {
	public static void main(String[] args) throws SaldoInsuficienteExpception {
		Cuenta cuenta = new CuentaAhorros(111, 222);
		cuenta.deposita(200);
		cuenta.saca(200);
		cuenta.saca(10);
	}
}

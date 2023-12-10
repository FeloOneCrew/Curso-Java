package bytebank_heredado;

public class TestCuenta {
	public static void main(String[] args) {
		CuentaCorriente cc = new CuentaCorriente(1, 1);
		CuentaAhorros ca = new CuentaAhorros(2, 2);
		
		cc.deposita(2000);
		cc.transfiere(1000, ca);
		
		System.out.println(cc.getSaldo());
		System.out.println(ca.getSaldo());
		
		ca.deposita(3000);
		ca.transfiere(1500, cc);
		
		System.out.println(ca.getSaldo());
		System.out.println(cc.getSaldo());
	}
}

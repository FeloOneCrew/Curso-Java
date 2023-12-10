package proyecto_bytebank;

public class PruebaAcesso {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(777);
		cuenta.setAgencia(-2);
		//cuenta.saldo = 200;
		cuenta.depositar(500);
		cuenta.retirar(300);
		//System.out.println(cuenta.saldo);
		//cuenta.saldo -= 300;
		System.out.println(cuenta.getSaldo());
		System.out.println(cuenta.getAgencia());
	}
}

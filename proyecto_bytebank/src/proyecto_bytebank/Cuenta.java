package proyecto_bytebank;

public class Cuenta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;

	public Cuenta(int agencia) {
		this.agencia = agencia;

		if (agencia < 0) {
			System.out.println("El valor de la agencia es menor a 1");
			Cuenta.total = 1;
		}else {
			System.out.println("Estoy creando una cuenta");
			Cuenta.total = agencia;
		}
	}

	// void(Palabra reservada) se utiliza en el metodo para no devolver valor.
	public void depositar(double valor) { // Lo que esta dentro del parentesis dentro del metodo es un parametro.
		this.saldo += valor;
	}

	public boolean retirar(double valor) {

		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	public boolean transferir(double valor, Cuenta cuenta) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			cuenta.depositar(valor);
			return true;
		}
		return false;
	}

	// ----------- get variables

	public double getSaldo() {
		return this.saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public static int getTotal() {
		return Cuenta.total;
	}

	// ----------- set variables

	/*
	 * public void setSaldo(double saldo) { this.saldo = saldo; }
	 */

	public void setAgencia(int agencia) {

		if (agencia > 0) {
			this.agencia = agencia;
		} else {
			System.out.println("No esta permitido los numeros negativos");
		}
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

}
package bytebank_heredado;

public abstract class Cuenta {
	protected double saldo; //Protected para poder acceder de las clases hijas.
	private int agencia = 1;
	private int numero;
	private Cliente titular = new Cliente();

	private static int total;

	/*public Cuenta() {

	}*/

	public Cuenta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estoy creando una cuenta " + this.numero);

		Cuenta.total++;
	}

	public abstract void deposita(double valor);

	public abstract void saca(double valor) throws SaldoInsuficienteExpception;

	public boolean transfiere(double valor, Cuenta destino) {
		if (this.saldo >= valor) {
			try {
				this.saca(valor);
			} catch (SaldoInsuficienteExpception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia > 0) {
			this.agencia = agencia;
		}
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero > 0) {
			this.numero = numero;
		}
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotal() {
		return Cuenta.total;
	}
}

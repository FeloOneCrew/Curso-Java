package bytebank_heredado;

public class CuentaCorriente extends Cuenta {
	
	public CuentaCorriente( int agencia, int numero) {
		super(agencia, numero);
	}
	
	/*@Override
	public boolean saca(double valor) {
		double comision = 0.2;

		if (this.saldo >= valor) {
			this.saldo -= valor + comision;
			return true;
		} else {
			return false;
		}
	}*/
	
	@Override
	public void saca(double valor) throws SaldoInsuficienteExpception {
		double comision = 0.2;

		if (this.saldo < valor) {
			throw new SaldoInsuficienteExpception("Saldo insuficiente");
		}
		this.saldo -= (valor + (valor * comision));
	}

	@Override
	public void deposita(double valor) {
		// TODO Auto-generated method stub
		this.saldo += valor;
		System.out.println("Se ha depositado a la cuenta corriente: " +  this.saldo);
	}

}

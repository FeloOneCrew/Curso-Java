package bytebank_heredado;

public class CuentaAhorros extends Cuenta {

	public CuentaAhorros(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	/*public void saca(double valor) {
		// TODO Auto-generated method stub
		double comision = 0.2;
		if (this.saldo >= valor) {
			this.saldo -= valor + comision;
			return true;
		} else {
			return false;
		}
	}*/
	
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
		System.out.println("Se ha depositado a la cuenta de ahorros: " +  valor);
	}
	
}

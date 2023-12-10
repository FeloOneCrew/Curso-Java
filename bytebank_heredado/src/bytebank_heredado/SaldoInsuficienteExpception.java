package bytebank_heredado;

public class SaldoInsuficienteExpception extends Exception {
	public SaldoInsuficienteExpception(String mensaje) {
		super(mensaje);
	}
}

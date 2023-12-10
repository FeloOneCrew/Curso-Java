package bytebank_heredado;

public class Administrador extends Funcionario implements Autenticador {
	
	private AutenticadorUtil util;
	
	public Administrador() {
		this.util = new AutenticadorUtil();
	}
	
	@Override
	public double getBonificacionSalario() {
		// TODO Auto-generated method stub
		return this.getSalario();
	}

	@Override
	public void setclave(String clave) {
		this.setclave(clave);
	}

	@Override
	public boolean iniciarsesion(String clave) {
		return this.util.iniciarsesion(clave);
	}
}

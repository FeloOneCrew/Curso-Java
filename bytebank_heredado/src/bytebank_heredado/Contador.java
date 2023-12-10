package bytebank_heredado;

public class Contador extends Funcionario implements Autenticador {
	private String Licencia;

	public String getLicencia() {
		return Licencia;
	}

	public void setLicencia(String licencia) {
		Licencia = licencia;
	}
	
	@Override
	public double getBonificacionSalario() {
		//double SalTotal = super.getSalario() + super.getBonificacionSalario();
		double SalTotal = super.getSalario() + (super.getSalario() / 2);
		return SalTotal;
	}

	@Override
	public void setclave(String clave) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean iniciarsesion(String clave) {
		// TODO Auto-generated method stub
		return false;
	}
}

package bytebank_heredado;

public class ControlBonificacion {
	
	private double suma;
	
	public double registrarSalario(Funcionario funcionario) {
		this.suma = this.suma + funcionario.getBonificacionSalario();
		System.out.println("La suma es: " + this.suma );
		return this.suma;
	}
}

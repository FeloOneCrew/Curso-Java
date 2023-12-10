package bytebank_heredado;

public class TestControlBonificacion {
	public static void main(String[] args) {
		Funcionario Mayra = new Contador();
		Mayra.setSalario(1500000);
		
		Gerente Felo = new Gerente();
		Felo.setSalario(4100000);
		
		Contador Velez= new Contador();
		Velez.setSalario(2000000);
		
		ControlBonificacion control = new ControlBonificacion();
		control.registrarSalario(Mayra);
		control.registrarSalario(Felo);
		control.registrarSalario(Velez);
		
	}
}

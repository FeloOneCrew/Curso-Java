package bytebank_heredado;

public class TestGerente {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		//Funcionario gerente = new Funcionario();
		gerente.setSalario(6000000);
		gerente.setTipo(1);
		gerente.setclave("felocrew");
		
		System.out.println("Salario " + gerente.getSalario());
		System.out.println("Salario + bonificación " + gerente.getBonificacionSalario());
		System.out.println(gerente.iniciarsesion("felocrew"));
	}
}

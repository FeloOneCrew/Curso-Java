package bytebank_heredado;

public class TestFuncionario {
	public static void main(String[] args) {
		Gerente funcionario = new Gerente();
		
		funcionario.setNombre("Felo");
		funcionario.setDocumento("1035853362");
		funcionario.setSalario(4100000);
		funcionario.setTipo(0);


		System.out.println(funcionario.getNombre());
		System.out.println(funcionario.getBonificacionSalario());
	}
}

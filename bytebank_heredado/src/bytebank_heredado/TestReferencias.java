package bytebank_heredado;

public class TestReferencias {
	public static void main(String[] args) {
		
		// El elemento mas genérico(Funcionario) puede ser adaptado al
		//    elemento mas especifico(Gerente)y viceversa no aplica - por que todos los funcionario no son gerentes.
		//Las referencias de tipos de clases más genéricos referencian objetos más específicos.
		Funcionario funcionario = new Gerente();
		funcionario.setDocumento("felo");
		
		Gerente gerente = new Gerente();
		gerente.setNombre("Andrés");
		
		
	}
}

package bytebank_heredado;

public class TestSistemaInterno {
	
	public static void main(String[] args) {
		SistemaInterno si = new SistemaInterno();
		Gerente gerente = new Gerente();
		gerente.setNombre("felo");
		gerente.setSalario(10000);
		Administrador admin = new Administrador();
		
		si.autenticar(admin);
		si.autenticar(gerente);
		
		System.out.println(gerente.getNombre());
		System.out.println(gerente.getSalario());
	}

}

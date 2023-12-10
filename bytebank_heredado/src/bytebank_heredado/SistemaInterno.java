package bytebank_heredado;

public class SistemaInterno {
	
	private String clave = "felocrew";
	
	public boolean autenticar(Autenticador funcionario){
		boolean puedeIniciarSesison = funcionario.iniciarsesion(this.clave);
		
		if(puedeIniciarSesison) {
			System.out.println("Login Exitoso");
			return true;
		}else {
			System.out.println("Error en Login");
			return false;
		}
	}
}

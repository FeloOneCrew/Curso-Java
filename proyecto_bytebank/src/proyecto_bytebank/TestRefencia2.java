package proyecto_bytebank;

public class TestRefencia2 {
	public static void main(String[] args) {
		Cuenta cuentaUsuario = new Cuenta(666);
	    
		//Cliente cliente = new Cliente(); // esto y lo de la siguiente linea es lo mismo
	     cuentaUsuario.setTitular(new Cliente());
	     
	     cuentaUsuario.getTitular().setTelefono("2555555");
	     
	     System.out.println(cuentaUsuario.getTitular().getTelefono());
	}
}

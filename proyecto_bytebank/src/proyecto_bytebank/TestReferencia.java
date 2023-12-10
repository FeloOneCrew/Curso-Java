package proyecto_bytebank;

public class TestReferencia {
	public static void main(String[] args) {
		Cliente cuenta = new Cliente();
		 cuenta.setNombre("Felo");
		 cuenta.setDocumento("1234567");
		 cuenta.setTelefono("9999999");
		//cuenta.sexo = "Masculino";
		 
		 Cuenta cuentaUsuario = new Cuenta(555);
		 cuentaUsuario.setAgencia(1);
		 cuentaUsuario.depositar(200);
		 System.out.println(cuentaUsuario.getAgencia());
		 System.out.println(cuentaUsuario.getSaldo());
		 
		 cuentaUsuario.setTitular(cuenta); // aqui se conecta o se refencia CUENTA con CLIENTE
		 
		 cuentaUsuario.getTitular().setSexo("Masculino");
		 System.out.println(cuentaUsuario.getTitular().getSexo());
		 
	}
}

package proyecto_bytebank;

public class PruebaEncapsulamiento {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(888);
		Cliente cliente = new Cliente();
		
		cliente.setNombre("Felo");
		cliente.setDocumento("1035853362");
		cliente.setSexo("Masculino");
		cliente.setTelefono("9999999");

		
		cuenta.setTitular(cliente);
		
		System.out.println(cliente.getNombre());
		System.out.println(cuenta.getTitular().getNombre());
		System.out.println(Cuenta.getTotal());
	}

}

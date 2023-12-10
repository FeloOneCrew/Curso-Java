package proyecto_bytebank;

public class PruebaMetodos {
	
	public static void main(String[] args) {
		Cuenta miCuenta = new Cuenta(333);
		miCuenta.depositar(700);
		miCuenta.depositar(200);
		
		System.out.println("El valor de la cuenta es: " + miCuenta.getSaldo());
		
		miCuenta.retirar(100);
		System.out.println("El valor de la cuenta es: " + miCuenta.getSaldo());
		
		Cuenta otraCuenta = new Cuenta(444);
		 
		otraCuenta.depositar(1300);
		
		boolean seTransfirio = otraCuenta.transferir(300, miCuenta);
		if (seTransfirio){
			System.out.println("El valor se transfirio exitosamente");
		}
		else {
			System.out.println("El valor NO se pudo transfir");
		}
		
		System.out.println("El valor de la cuenta es: " + miCuenta.getSaldo());
		System.out.println("El valor de la cuenta es: " + otraCuenta.getSaldo());
	}

}

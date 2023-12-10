package proyecto_bytebank;

public class CrearCuenta {
	public static void main(String[] args) {
		Cuenta primeraCuenta = new Cuenta(111); // instanciando el objeto cuenta.
		primeraCuenta.depositar(1034);
		
		System.out.println("Primera cuenta " + primeraCuenta.getSaldo());
		
		//new Cuenta() - Separame un espacion de memoria para este objeto que voy a crear con datos diferentes
		
		Cuenta SegundaCuenta = new Cuenta(222);
		SegundaCuenta.depositar(500);
		
		System.out.println("Segunda " + SegundaCuenta.getSaldo());
		
		Cuenta TerceraCuenta = SegundaCuenta;
		TerceraCuenta.depositar(1500);
		
		System.out.println("Tercera cuenta " + TerceraCuenta.getSaldo());
		
		System.out.println("Primera cuenta " + primeraCuenta.getSaldo() + " Segunda cuenta " + SegundaCuenta.getSaldo() );
		
		System.out.println("segunda cuenta " + SegundaCuenta.getSaldo() + " tercera cuenta " + TerceraCuenta.getSaldo() );
	}
}

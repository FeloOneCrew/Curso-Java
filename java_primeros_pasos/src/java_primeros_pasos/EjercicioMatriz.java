package java_primeros_pasos;

public class EjercicioMatriz {

	public static void main(String[] args) {
		for (int tabla = 0; tabla <=10; tabla++) {
			for (int contador = 0; contador <= 10; contador++) {
				if (tabla < contador) {
					break;
				}
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}

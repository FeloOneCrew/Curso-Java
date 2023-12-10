package java_primeros_pasos;

public class EjercicioTablasMultiplicacion {
	public static void main(String[] args) {
		int mult = 0;
		for (int tabla = 1; tabla <= 10; tabla++) {
			for (int contador = 1; contador <= 10; contador++) {
				mult = tabla * contador;
				System.out.println(tabla + " * " + contador + " = " +  mult);
			}
			System.out.println("------------------------------------------------------");
		}
	}
}

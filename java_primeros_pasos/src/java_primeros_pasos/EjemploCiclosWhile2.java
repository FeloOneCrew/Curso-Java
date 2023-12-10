package java_primeros_pasos;

public class EjemploCiclosWhile2 {
	public static void main(String[] args) {
		int contador = 0;
		int suma = 0;
		while (contador <= 10) {
			suma += contador;
			contador += 1;
		}
		System.out.println(suma);
	}
}

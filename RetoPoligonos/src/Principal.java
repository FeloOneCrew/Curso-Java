import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	/* Hacer un programa para calcular el area de Poligonos (Triangulos y Rectangulos)
	 * el programa debe ser capaz de almacenar en un arreglo N triángulos y rectángulos,
	 * y al final mostrar el área y los datos de cada uno.Para ello se tendrá lo siguiente;
	 * 
	 * - Una super clase llamada Poligono
	 * - Una subclase llamada Réctangulo
	 * - Una subclase llamada Triángulo.
	 */

	static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
	static Scanner entrada =  new Scanner(System.in); // Se crea la variabla global para poder utilizarlo en toda la clase
	
	
	public static void main(String[] args) {
		//Llamar al método Poligono
		llenarPoligono();
		
		//MostrarDatos y area de los poligonos
		MostrarResultados();
	}
	
	public static void llenarPoligono() {
		char respuesta;
		int opcion;
		
		do {
			
			
			do {
				System.out.println("Eliga el Póligono para hallar el área: ");
				System.out.println("1 - Triangulo");
				System.out.println("2 - Rectangulo");
				System.out.println("Opcion: ");
				opcion = entrada.nextInt();//Capturar lo que ingresa el usuario en consola.
			} while (opcion > 2 || opcion < 1);
			
			switch(opcion) {
				case 1: llenarTriangulo();
					break;
				case 2: llenarRectangulo();
					break;
			}
			
			System.out.print("\nDesea introducir otro poligono (s/n)");
			respuesta = entrada.next().charAt(0);
			System.out.println("");
			} while (respuesta == 'S' || respuesta == 's');
	}
	
	//Método para poder ingresar los datos del triangulo
	public static void llenarTriangulo(){
		double lado1, lado2,lado3;
		
		System.out.println("Por favor dígite: ");
		System.out.println("valor Lado 1 ");
		lado1 = entrada.nextInt();
		System.out.println("valor Lado 2 ");
		lado2 = entrada.nextInt();
		System.out.println("valor Lado 3 ");
		lado3 = entrada.nextInt();
		
		Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
		//Guardamos un triangulo en el arreglo de poligonos.
		poligono.add(triangulo);
	}
	
	//Método para poder ingresar los datos del triangulo
	public static void llenarRectangulo(){
		double base, altura;
		
		System.out.println("Por favor dígite: ");
		System.out.println("Ingrese el valor de la base: ");
		base = entrada.nextInt();
		System.out.println("Ingrese el valor de la altura: ");
		altura = entrada.nextInt();
		
		Rectangulo rectangulo = new Rectangulo(base, altura);
		//Guardamos un Rectangulo en el arreglo de poligonos.
		poligono.add(rectangulo);
	}
	
	public static void MostrarResultados() {
		for (Poligono poli : poligono) {
			System.out.println(poli.toString());
			System.out.println("El area es: "  + poli.area());
			System.out.println(""); // salto de linea
		}	
	}
}

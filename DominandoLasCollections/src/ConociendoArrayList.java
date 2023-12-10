import java.util.ArrayList;

public class ConociendoArrayList {
	 public static void main(String[] args) {
		String variable1 = "Ejemplo 1";
		String variable2 = "Ejemplo 2";
		String variable3 = "Ejemplo 3";
		String variable4 = "Ejemplo 4";
		
		//----- ArrayList----//
		ArrayList<String> lista = new ArrayList<>(); // creando una lista vacia.
		
		lista.add(variable1); // añadir datos a la lista
		lista.add(variable2);
		lista.add(variable3);
		lista.add(variable4);
		System.out.println(lista);
		
		lista.remove(3);// remover datos de la lista
		System.out.println(lista);
		
		lista.set(1, "Ejemplo alterado"); //Cambiar o alterar un dato por otro en una lista
		System.out.println(lista);
		
		System.out.println(lista.size()); // tamaño de la lista
	}
}

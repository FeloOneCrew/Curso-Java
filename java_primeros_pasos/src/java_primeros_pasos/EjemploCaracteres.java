package java_primeros_pasos;

public class EjemploCaracteres 
{
	//ATAJO Para colocar el siguiente método, indicamos la combinación de teclas 'Control' + 'espacio'
	public static void main(String[] args) 
	{
		char caracter = 'a'; // char solo soporte una letra y se indica con comilla simple ''
		char caracter2 = 52; // soporte numero, pero el valor es el que corresponde a la tabla Unicode
		System.out.println(caracter);
		System.out.println(caracter2);
		
		char valor = 65;                // Compila! el resultado es la A que corresponde al unicode
        System.out.println(valor);

        valor = (char) (valor + 1);     // Compila!
        System.out.println(valor);
	}
}

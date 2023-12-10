package java_primeros_pasos;

public class ConversionDeVariables 
{
	public static void main(String[] args)
	{
		double valor = 2.4536;
		System.out.println((int)valor); //Converter double to string
		
		double valor1; // Declaracion de una variable
		 valor1 = 25458.736;
		int variableEntero = (int)valor1;
		System.out.println(variableEntero);
		
		//Para indicar numeros muy grandes siempre hay que especifar al final del numero una "l" o "L" y indiar el tipo long
		
		long prueba = 12556564884L;
		
		//Tipo de numero pequeño "short"
		
		short numeropequeno = 1245;
		byte numeroMaspequeno = 17;
		
		//numero double pero mas pequeño, se indicar "F" al final
		
		float numeroDecimalpequeno = 1.5f;
	}
}

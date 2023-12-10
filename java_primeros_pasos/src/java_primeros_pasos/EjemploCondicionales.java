package java_primeros_pasos;

public class EjemploCondicionales 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello mundo");
		
		int edad = 16;
		int cantidad = 1;
		
		if (edad >= 18)
		{
			System.out.println("Puede ingresar");
		}
		else
		{
			if (cantidad > 1)
			{
				System.out.println("Es menor, pero puede ingresar");
			}
			else
			{
				System.out.println("No puede ingresar");
			}
		}
	}
}

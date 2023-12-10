package model;

public class Aula {
	
	private String nombre;
	
	public Aula(String nombre){
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override //Se sobreescribe el metodo toString que ya viene por defecto en todas las clases.
	//Si no se sobreescribe va a imprimir el toString del objeto y no lo que necesitamos que imprima.
	public String toString() {
		return this.nombre;
		
	}

}

package model;

public class Alumno {
	
	private String nombre;
	private String codigo;
	
	public Alumno(String nombre, String codigo){
		this.nombre = nombre;
		this.codigo = codigo;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	@Override //Se sobreescribe el metodo toString que ya viene por defecto en todas las clases.
	//Si no se sobreescribe va a imprimir el toString del objeto y no lo que necesitamos que imprima.
	public String toString() {
		return this.nombre;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Alumno alumno = (Alumno) obj;
		return this.nombre.equals(alumno.getNombre());
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.nombre.hashCode();
	}

}

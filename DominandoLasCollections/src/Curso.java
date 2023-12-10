import java.util.ArrayList;
import java.util.List;

import model.Aula;

public class Curso {
	
	private String nombre;
	private int tiempo;
	private List<Aula> claseList = new ArrayList<>();

	public Curso(String nombre, int tiempo) {
		this.nombre = nombre;
		this.tiempo =  tiempo;
	}
	
	public Curso(String nombre, int tiempo, List<Aula> claseList) {
		this.nombre = nombre;
		this.tiempo =  tiempo;
		this.claseList = claseList;
	}
	
	public String getNombre() {
		return nombre;
	}
	public List<Aula> getClaseList() {
		return claseList;
	}

	public void setClaseList(List<Aula> claseList) {
		this.claseList = claseList;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTiempo() {
		return tiempo;
	}
	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}
	
	public void addClase(Aula clase) {
		this.claseList.add(clase);
	}
	
	@Override //Se sobreescribe el metodo toString que ya viene por defecto en todas las clases.
	//Si no se sobreescribe va a imprimir el toString del objeto y no lo que necesitamos que imprima.
	public String toString() {
		return this.nombre;
		
	}

}

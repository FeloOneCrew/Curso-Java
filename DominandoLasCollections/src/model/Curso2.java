package model;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

import model.Aula;

public class Curso2 {
	
	private String nombre;
	private int tiempo;
	private List<Aula> aulaList = new ArrayList<>();
	private Collection<Alumno> alumnos = new HashSet<>();
	//private Collection<Alumno> alumnos = new LinkedHashSet<>();

	public Curso2(String nombre, int tiempo) {
		this.nombre = nombre;
		this.tiempo =  tiempo;
	}
	
	public Curso2(String nombre, int tiempo, List<Aula> claseList) {
		this.nombre = nombre;
		this.tiempo =  tiempo;
		this.aulaList = claseList;
	}
	
	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }
	
	public int getTiempo() { return tiempo; }
	public void setTiempo(int tiempo) { this.tiempo = tiempo; }
	
	public List<Aula> getAulaList(){ return Collections.unmodifiableList(aulaList);	} // para que no sea modificable la lista (lista ).

	public void aulaList(List<Aula> claseList) { this.aulaList = claseList; }

	public void addAula(Aula clase) { this.aulaList.add(clase); }
	
	public void addAlumno(Alumno alumno) { this.alumnos.add(alumno); }
	
	public boolean verificarAlumno(Alumno alumno) {return this.alumnos.contains(alumno);}
	
	public Collection<Alumno> getAlumnos() {
		return alumnos;
	}

	 //Se sobreescribe el metodo toString que ya viene por defecto en todas las clases.
	//Si no se sobreescribe va a imprimir el toString del objeto y no lo que necesitamos que imprima.
	@Override
	public String toString() { return this.nombre; }

}

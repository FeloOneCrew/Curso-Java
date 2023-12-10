package model;

import java.util.ArrayList;

public class CreandoListasConObjetos2 {
	
	public static void main(String[] args) {
		Curso2 curso1 = new Curso2("Geometria", 10);
		curso1.addAula(new Aula("Arraylist"));
		curso1.addAula(new Aula("Listas"));
		
		ArrayList<Curso2> cursos = new ArrayList<>();
		cursos.add(curso1);
		

		System.out.println(cursos + " " + cursos.get(0).getAulaList());

	}
}

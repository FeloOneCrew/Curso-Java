package model;

import java.util.ArrayList;
import java.util.List;

public class CreandoListasConObjetos3 {
	
	public static void main(String[] args) {
		Curso2 curso1 = new Curso2("Geometria", 10);
		curso1.addAula(new Aula("Arraylist"));
		curso1.addAula(new Aula("Listas"));
		curso1.addAula(new Aula("Inmutable"));
		
		List<Aula> aulalist = curso1.getAulaList();
	
		System.out.println(curso1 + " " + aulalist);

	}
}

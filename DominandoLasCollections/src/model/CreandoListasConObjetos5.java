package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class CreandoListasConObjetos5 {
	
	public static final List<List<Integer>> listas = new ArrayList<List<Integer>>(){
        {
            add(new LinkedList<>());
            add(new ArrayList<>());
        }
    };

    public static void main(String[] args) {
        Curso2 curso1 = new Curso2("Historia",30) ;
        Curso2 curso2 = new Curso2("Algebra",10) ;
        Curso2 curso3 = new Curso2("Aritmetica",20) ;
        Curso2 curso4 = new Curso2("Geometria",50) ;


        ArrayList<Curso2> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);

        //System.out.println(cursos);

        Collections.sort(cursos,Comparator.comparing(Curso2::getNombre).reversed());

        int suma = 0;
        
      //Sumar el tiempo total de los cursos con for sin tener en cuenta los cursos de historia
        for(Curso2 curso: cursos){
            if(!curso.getNombre().equalsIgnoreCase("Historia")) {
                suma += curso.getTiempo();
            }
        }

        System.out.println(suma);

        //System.out.println(cursos);

        List<Curso2> cursoList = cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Ruby")).sorted(Comparator.comparingInt(Curso2::getTiempo)).collect(Collectors.toList());
        
        //Sumar el tiempo total de los cursos con metodos sin tener en cuenta los cursos de historia
        System.out.println(cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Historia")).mapToInt(Curso2::getTiempo).sum());
        System.out.println(cursoList);

    }
}

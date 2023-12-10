package model;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;


public class CreandoHashCode {
	// TODO: https://docs.oracle.com/javase/tutorial/collections/interfaces/index.html
    // TODO: https://docs.oracle.com/javase/8/docs/api/index.html?java/util/Collection.html

    public static void main(String[] args) {

        Alumno alumno1 = new Alumno("Luis Miguel", "01");
        Alumno alumno2 = new Alumno("Pepito los palotes", "02");
        Alumno alumno3 = new Alumno("Juan Carlos", "03");
        Alumno alumno4 = new Alumno("Pedro Pedrito", "04");
        Alumno alumno5 = new Alumno("Gustavo Sanchez", "05");
        Alumno alumno6 = new Alumno("Marcia Maria", "06");
        Alumno alumno7 = new Alumno("Felo crew", "07");
     
        Collection<Alumno> listaAlumnos = new HashSet<>();

        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);
        listaAlumnos.add(alumno6);
        listaAlumnos.add(alumno7);
        
        Alumno alumnoNuevo = new Alumno("Luis Miguel", "001");

        System.out.println(alumno1.equals(alumnoNuevo));
        System.out.println(listaAlumnos.contains(alumnoNuevo));
 
    }
}

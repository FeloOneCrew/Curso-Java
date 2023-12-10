import java.util.ArrayList;


public class CreandoListasConObjetos {
	public static void main(String[] args) {
			
		Curso curso1 = new Curso("Geometria", 10);
		Curso curso2 = new Curso("Fisica", 20);
		Curso curso3 = new Curso("Matematicas", 30);
		Curso curso4 = new Curso("Arte", 40);
		ArrayList<Curso> curso = new ArrayList<>();
		
		curso.add(curso1);
		curso.add(curso2);
		curso.add(curso3);
		curso.add(curso4);
		
		System.out.println(curso);

	}
}

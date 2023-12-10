
public abstract class Poligono {
	protected int numeroLados;

	public Poligono(int numeroLados) {
		this.numeroLados = numeroLados;
	}

	public int getNumeroLados() {
		return numeroLados;
	}
	
	
	//Declaramos metodo area como abstracta
	public abstract double area();
	
	//Para imprir las caracteristicas de la clase.
		@Override
		public String toString() {
			return "Numero de lados=" + numeroLados;
		}
}

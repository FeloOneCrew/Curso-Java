
public class Triangulo extends Poligono {
	private double lado1;
	private double lado2;
	private double lado3;

	public Triangulo(double lado1, double lado2, double lado3) {
		super(3);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	@Override
	public double area() {
		double s = (lado1 + lado2 + lado3) / 2;
		return  Math.sqrt(s*(s - lado1)*(s-lado2)*(s-lado3));
	}

	//sobreescribimos el metodo toString Para imprir las caracteristicas de la clase.
	@Override
	public String toString() {
		return "Triangulo: \n" + super.toString() + "\nlado1= " + lado1 + "\nlado2= " + lado2 + "\nlado3= " + lado3;
	}

}

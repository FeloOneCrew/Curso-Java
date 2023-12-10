
public class Rectangulo extends Poligono {

	private double base;
	private double altura;

	public Rectangulo(double base, double altura) {
		super(2);
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public double getAltura() {
		return altura;
	}

	//Sobreescribimos el metodo area
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return base * altura;
	}

	//sobreescribimos el metodo toString Para imprir las caracteristicas de la clase.
	@Override
	public String toString() {
		return "Rectangulo: \n" + super.toString() + "\nbase= " + base + "\naltura= " + altura;
	}
	
}

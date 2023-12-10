package bytebank_heredado;

public class Gerente extends Funcionario implements Autenticador { // Herencia las funciones y atributos de la clase padre.
	
	//private String nombre;
	//private String documento;
	//private double salario;
	
	/**public Gerente() { //Contructor
	
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getBonificacionSalario(){
		return this.salario ;
	}
	**/
		
	//Sobre-escritura de método
	@Override
	public double getBonificacionSalario() {
		//double SalTotal = super.getSalario() + super.getBonificacionSalario();
		double SalTotal = super.getSalario() + (super.getSalario() * 0.1);
		return SalTotal;
	}

	@Override
	public void setclave(String clave) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public boolean iniciarsesion(String clave) {
		// TODO Auto-generated method stub
		return false;
	}
	
}

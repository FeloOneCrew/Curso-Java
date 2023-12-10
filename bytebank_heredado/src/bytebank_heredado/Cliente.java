package bytebank_heredado;

public class Cliente implements Autenticador{
	private String nombre;
	private String documento;
	private String telefono;
	
	private AutenticadorUtil util;
	
	public Cliente(){
		this.util = new AutenticadorUtil(); // a estp se le llama composicion de objetos
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
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	@Override
	public void setclave(String clave) {
		this.setclave(clave);
	}
	@Override
	public boolean iniciarsesion(String clave) {
		return  this.util.iniciarsesion(clave);
	}
}

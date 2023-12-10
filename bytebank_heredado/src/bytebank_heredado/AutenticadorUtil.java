package bytebank_heredado;

public class AutenticadorUtil {
	
	private String clave;
	
	public void setclave(String clave) {
		this.clave = clave;
	}

	public boolean iniciarsesion(String clave) {
		return this.clave == clave;
	}
}

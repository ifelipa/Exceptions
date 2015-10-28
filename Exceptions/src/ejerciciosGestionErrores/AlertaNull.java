package ejerciciosGestionErrores;

public class AlertaNull extends NullPointerException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String msg;
	public AlertaNull(String c) {
		this.msg= c;
	}
	
	public String toString() {
		return "Aviso de gestion: ->"+ this.msg;
	}
	
	
	
	
}

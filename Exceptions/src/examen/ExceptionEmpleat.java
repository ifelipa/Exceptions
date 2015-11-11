package examen;

public class ExceptionEmpleat extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String msg;
	String nomEmp;
	
	public ExceptionEmpleat(String nomEmp, String c) {
		this.msg= c;
		this.nomEmp=nomEmp;
	}
	
	public String toString() {
		return "Aviso de gestion del empleado: -> "+ this.nomEmp +"\n"+ this.msg;
	}

}

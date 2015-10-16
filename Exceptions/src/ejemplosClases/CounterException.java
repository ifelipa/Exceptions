package ejemplosClases;

public class CounterException extends Exception{
	
	String complaint;
	
	public void counterException (String complaint) {
		this.complaint = complaint;
	}

	public String toString() {
		return "ContaException [complaint=" + complaint + "]";
	}
	

}

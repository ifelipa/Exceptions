package SolExamen;

public class Empleat extends Persona {
	String carrec;
	Double sou;
	
	public Empleat() {
		super();
	}
	
	public Empleat(String nom, String cognom, String carrec, Double sou) {
		this.nom = nom;
		this.cognom = cognom;
		this.carrec = carrec;
		this.sou = sou;
	}
	
	public String getCarrec() {
		return carrec;
	}
	public void setCarrec(String carrec) {
		this.carrec = carrec;
	}
	public Double getSou() {
		return sou;
	}
	public void setSou(Double sou) {
		this.sou = sou;
	}
	
}
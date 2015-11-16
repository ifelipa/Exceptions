package SolExamen;

public class Cap extends Empleat {
	Double bonus;

	public Cap() {
		super();
	}
	
	public Cap(String nom, String cognom, String carrec, Double sou, Double bonus) {
		this.nom = nom;
		this.cognom = cognom;
		this.carrec = carrec;
		this.sou = sou;
		this.bonus = bonus;
	}
	
	public Double getBonus() {
		return bonus;
	}

	public void setBonus(Double bonus) {
		this.bonus = bonus;
	}
}
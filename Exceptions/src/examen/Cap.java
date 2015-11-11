package examen;

public class Cap extends Empleat {
	double bonusAnual;

	public Cap(String nom, String cognom, String carrec, double souAnual, double bonusAnual) {
		super(nom, cognom, carrec, souAnual);
		this.bonusAnual = bonusAnual;
	}

	public double getBonusAnual() {
		return bonusAnual;
	}

	public void setBonusAnual(double bonusAnual) {
		this.bonusAnual = bonusAnual;
	}
	
}

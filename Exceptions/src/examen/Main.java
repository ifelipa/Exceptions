package examen;

import javax.imageio.IIOException;

import org.w3c.dom.ranges.RangeException;

public class Main {

	public static void main(String[] args) {
		Empleat emp1 = new Empleat("nom1", "cogn1", "carrec1", 680.40);
		Empleat emp2 = new Empleat("nom2", "cogn2", "carrec2", 680.40);
		Empleat emp3 = new Empleat("nom3", "cogn3", "carrec3", 680.40);
		Empleat emp4 = new Empleat("nom4", "cogn4", "carrec4", 680.40);
		Empleat emp5 = new Empleat("nom5", "cogn5", "carrec5", 680.40);
		Cap cap1 = new Cap("capnom1", "capCogn1", "carrecCap1", 1500.00, 500.00);
		Cap cap2 = new Cap("capnom2", "capCogn2", "carrecCap2", 1500.00, 500.00);

		System.out.println("***Exercici3 *** \n");
		// Ex3
		double p1 = 10;
		double p2 = -10;

		try {
			pujarSou(emp1, p1);
			pujarSou(emp2, p2);

		} catch (ExceptionEmpleat e) {
			System.out.println(e.toString());
		}

		System.out.println("***Exercici4 *** \n");
		// Ex4
		int men = 2;
		try {
			double bonus = CalculBonus(cap1, men);
			System.out.println("El bono que le toca al jefe " + cap1.getNom() + " es de " + bonus);
		} catch (ArithmeticException e1) {
			e1.printStackTrace();
		}

		
		System.out.println("***Exercici5 *** \n");
		// Ex5
		try {
			metode1(true);
			metode2(false);
		} catch (IIOException e1) {
			e1.printStackTrace();
		}
		
		
		System.out.println("***Exercici6 *** \n");
		// Ex6
		try {
			metodeFinal();
			System.out.println("Final normal");
		} catch (Exception e) {
			// e.printStackTrace();
		} finally {
			System.out.println("Final en qualsevol cas");
		}
	}

	
	private static void metode1(boolean b) throws IIOException {
		if (b)	throw new IIOException("Metodo1");

	}

	private static void metode2(boolean b) throws IIOException {
		if (b)throw new IIOException("Metodo2");

	}

	private static void pujarSou(Empleat nouEmpleat, double porcen) throws ExceptionEmpleat {
		String nomEmp = nouEmpleat.getNom();
		if (porcen <= 0) {
			throw new ExceptionEmpleat(nomEmp, "No se admite menos de 0");
		} else {
			Double nouSou = nouEmpleat.getSouAnual() + (nouEmpleat.getSouAnual() * porcen / 100);
			nouEmpleat.setSouAnual(nouSou);
			System.out.println("El nuevo salario del empleado " + nomEmp + " es de " + nouEmpleat.getSouAnual());
		}

	}

	private static double CalculBonus(Cap cap1, int men) {
		double retorno = 0;

		if (men <= 0 || men >= 13) {
			throw new ArithmeticException();
		} else {
			retorno = cap1.getBonusAnual() / men;
		}
		return retorno;

	}

	private static void metodeFinal() throws Exception {
		throw new Exception();
	}

}

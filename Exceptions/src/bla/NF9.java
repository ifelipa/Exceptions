package bla;

import java.io.IOException;
import java.sql.SQLException;

public class NF9 {

		
	public static void main(String[] args) {
		
		try {
			Empleat e1 = new Empleat("Joan", "Rigol", "magatzem", 18000.0 );
			Empleat e2 = new Empleat("Anna", "Niubo", "producció", 28000.0 );
			Empleat e3 = new Empleat("David", "Garcia", "magatzem", 15000.0 );
			Empleat e4 = new Empleat("Josep", "Lopez", "producció", 29000.0 );
			Empleat e5 = new Empleat("Núria", "Pi", "magatzem", 18500.0 );
			Cap c1 = new Cap("Sandra", "Roig", "producció", 38000.0, 2500.0);
			Cap c2 = new Cap("John", "Doe", "magatzem", 39000.0, 1500.0);
			
			pujarSou(e1, 0.0);
			System.out.println("Nou sou: " + e1.getSou());
			
			pujarSou(e2, -1.0);
			System.out.println("Nou sou: " + e2.getSou());
			
			pujarSou(e3, 3.0);
			System.out.println("Nou sou: " + e3.getSou());
			
			pujarSou(e4, -5.0);
			System.out.println("Nou sou: " + e4.getSou());
			
			pujarSou(e5, 5.0);
			System.out.println("Nou sou: " + e5.getSou());
			
			
			System.out.println("Bonus cap 1: " + calculBonus(c1, 0));
			System.out.println("Bonus cap 2: " + calculBonus(c2, 2));
			
			m1(false);
			m1(true);
			m2(false);
			m1(true);
			
			System.out.println("Final normal");
		} catch (IOException | SQLException e) {
			System.out.println(e.toString());
		} catch (Exception e) {
			e.getMessage();
		} finally {
			System.out.println("Final en qualsevol cas");
		}

	}
	
	public static void pujarSou(Empleat em, double percentatge) {
		
		try {
			if (revisaPercentatge(percentatge)) em.setSou(em.sou * (1 + percentatge/100.0));
		} catch (ExcepcioPercentatges e) {
			System.out.println("Error, no podem pujar sous en negatiu");
		}
	}

	public static boolean revisaPercentatge(double percentatge) throws ExcepcioPercentatges {
		if (percentatge < 0) throw new ExcepcioPercentatges("Alerta, percentatge negatiu");
		return true;
	}
	
	public static double calculBonus(Cap c, double periodes) {
		
		try {
			if (revisaPeriode(periodes)) return c.getBonus()/periodes;
		} catch (ArithmeticException e) {
			System.out.println("Error, no podem pujar sous en negatiu");
		}
		return 0;
	}
	
	public static boolean revisaPeriode(double periodes) throws ArithmeticException {
		if (periodes == 0) throw new ArithmeticException();
		return true;
	}
	
	public static void m1(boolean a) throws IOException {
		if (a) throw new IOException("Pete al mètode 1");
	}
	public static void m2(boolean a) throws SQLException {
		if (a) throw new SQLException("Pete al mètode 2");
	}
	
} 

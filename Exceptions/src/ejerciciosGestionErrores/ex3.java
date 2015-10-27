package ejerciciosGestionErrores;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d=4;
		int v=0;
		
		try {
			division(d,v);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("No se puede dividir por cero");
		}

	}

	private static int division(int d, int v) {

		return d/v;
	}

}

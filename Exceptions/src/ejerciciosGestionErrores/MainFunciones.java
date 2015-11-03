package ejerciciosGestionErrores;

public class MainFunciones {

	public static void main(String[] args) {
		try {
			funcion1();
			System.out.println("Main llama f1");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Catch en main");
			e.printStackTrace();
		} finally {
			System.out.println("Fin");
		}
		System.out.println("final programa");

	}

	private static void funcion1() {
		funcion2();
		System.out.println("f1 llama f2");
		/*
		 * try { funcion2(); } catch (Exception e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); System.out.println(
		 * "Catch en funcion1"); }
		 */

	}

	private static void funcion2() {
		 funcion3();

//		try {
//			funcion3();
//			System.out.println("f2 llama f3");
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.out.println("Catch en funcion2");
//		}

	}

	private static void funcion3() {
		int[] ar = { 0, 1, 2, 3, 4 };
		for (int i = 0; i <= ar.length; i++) {
			System.out.println(ar[i]);
		}
	}
}

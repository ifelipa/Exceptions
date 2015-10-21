package ejerciciosGestionErrores;

public class MainFunciones {

	public static void main(String[] args) {
		try {
			funcion1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	private static void funcion1() {
		funcion2();
	/*	try {
			funcion2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
	}


	private static void funcion2() {
		funcion3();
		
	/*	
		try {
			funcion3();
		} catch (Exception e) {
			e.printStackTrace();
			//System.out.println("llamando a la f3... Error en la funcion 2");			
		}
	*/
		
	}

	
	private static void funcion3() {
		int[] ar = { 0, 1, 2, 3, 4 };
		for (int i = 0; i <= ar.length; i++) {
			System.out.println(ar[i]);
		}
		
	}
	
	
	

}

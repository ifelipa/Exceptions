package ejemplosClases;

public class test1 {

	public static void main(String[] args) {
		/*la condicion previa para que funcione el try/catch es que el programa compile, que sea un main por ejemplo
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		try {
			System.out.println(5/0);
		} catch (ArithmeticException e) {
			System.out.println("Vigila, estas dividiendo por cero");
			
		}
		
	}

}

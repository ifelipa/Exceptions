package ejerciciosGestionErrores;

public class Main {

	public static void main(String[] args) {

		// 1.1 y 1.2
		try {
			int[] ar = { 0, 1, 2, 3, 4 };
			for (int i = 0; i <= ar.length; i++) {
				System.out.println(ar[i]);
			}
			System.out.println("Final del programa");
		//} catch (ArrayIndexOutOfBoundsException e) {
		//} catch (StringIndexOutOfBoundsException e) { //cuando capturamos el exception que no corresponde al tipo de error automatricamente este peta, imprime finally
		} catch (Exception e) {
			 e.printStackTrace();
			 System.out.println("Get message       :"+ e.getMessage() );
			 System.out.println("Get cause       :"+ e.getCause() );
			 System.out.println("Get StackTrace       :"+ e.getStackTrace() );
			 System.out.println("Get getClass       :"+ e.getClass());
			 System.out.println("Get toString       :"+ e.toString());
			 
		} finally {
			System.out.println("Hola Mon");
		}
		System.out.println("Final-FINAL del programa");

	}

}

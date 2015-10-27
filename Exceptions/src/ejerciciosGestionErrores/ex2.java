package ejerciciosGestionErrores;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ex2 {
	public static void main(String[] args)  {
		
		try {
			cargar();
		} catch (SecurityException e) {
			e.printStackTrace();
			System.out.println("1");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("2");
		}
		
	}

	private static void cargar() throws FileNotFoundException, SecurityException {
		FileOutputStream f = new FileOutputStream("../docs/test.txt");
		
	}

}

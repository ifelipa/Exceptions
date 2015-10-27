package ejerciciosGestionErrores;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ex2 {
	public static void main(String[] args) {

		try {
			cargar();
		} catch (SecurityException e) {
			e.printStackTrace();
			System.out.println("1");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			if (e.getClass().getName() == "java.io.FileNotFoundException") {
				System.out.println("fichero no encontrado");

			}
			System.out.println("2");
		}
	}

	private static void cargar() throws SecurityException, IOException {
		FileOutputStream f = new FileOutputStream("../docs/test.txt");

		f.close();
	}

}

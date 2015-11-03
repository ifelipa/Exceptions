package ejerciciosGestionErrores;

public class ex4 {

	public static void main(String[] args) {

		Persona x = new Persona();
		try {
			x.setEdat(-10);
			System.out.println("ejecuta 1");
		} catch (IllegalArgumentException e) {
			System.out.println("Error en el argumento. FUERA DE RANGO");
			e.printStackTrace();
		}
		System.out.println("ejecuta 2");
	}

	// Clase Persona
	static public class Persona {
		private int edat;

		public void setEdat(int edat) {

			if (edat < 0 || edat > 110) {
				//Si no se cumple este if, se lanza una exception
				//que hay que capturarla un nivel más arriba.
				throw new IllegalArgumentException();

			} else {
				this.edat = edat;
			}
		}

	}

}

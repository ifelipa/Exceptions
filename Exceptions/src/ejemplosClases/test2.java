package ejemplosClases;

public class test2 {

	public static void main(String[] args) throws Exception {
		
		metodo1();
	}
	
	private static void metodo1() throws Exception{


		System.out.println("1");

		try {
			System.out.println("2");
			
			metodo2();
//			if (true)
//				throw new Exception();
			System.out.println("3");
		} catch (Exception e) {
			System.out.println("4");
			throw e;
			//new CounterException("Error");
		} finally {
			System.out.println("5");
		}
		System.out.println("6");

	}

	private static void metodo2() throws Exception {
		if (true)
			throw new Exception();
		
	}

}

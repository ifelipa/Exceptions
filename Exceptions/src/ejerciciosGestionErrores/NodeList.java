package ejerciciosGestionErrores;


//Clase NODELIST
public class NodeList {

	public Node inicio;
	public Node fin;
	int medida;

	public void agregar(Object in) {
		Node obj = new Node(in);

		if (this.medida == 0) {
			this.inicio = obj;
		} else {
			this.fin.setSiguiente(obj);
		}
		this.fin = obj;
		medida++;
	}

	public Node Eliminar() {
		Node eliminarObj;
		if (this.medida == 0) {
			throw new AlertaNull("apuntando a null");
		} else {
			eliminarObj = this.inicio;
			this.inicio = inicio.getSiguiente();
			medida--;
		}
		return eliminarObj;

	}

	public boolean estaVacia() {
		return this.medida == 0;
	}

	public int medida() {
		return medida;
	}

	
	//Clase NODE
	public class Node {
		Object element;
		Node siguiente;

		public Node(Object element) {
			if (element == null)
				throw new AlertaNull("Error: no acepta valor null");
			this.element = element;

		}

		// Getter and Setters
		public Object getElement() {
			if (element == null)
				throw new AlertaNull("Error: no retorna valor null");
			return element;
		}

		public void setElement(Object element) {
			if (element == null)
				throw new AlertaNull("Error: no se asigna valor null");
			this.element = element;
		}

		public Node getSiguiente() {
			if (this.siguiente == null)
				throw new AlertaNull("Error: no hay siguiente");
			return siguiente;
		}

		public void setSiguiente(Node siguiente) {
			if (siguiente == null)
				throw new AlertaNull("Error: no hay siguiente");
			this.siguiente = siguiente;
		}
	}
	
	
	
	//MAIN
	public static void main(String[] args) {
		NodeList list = new NodeList();
		
		try {
			list.Eliminar();
			
		} catch (AlertaNull e) {
			System.out.println(e.toString());
		}
		
	}
	

}

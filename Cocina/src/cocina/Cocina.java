package cocina;

import java.util.ArrayList;

public class Cocina implements Constants{

	public ArrayList<Orden> ordenes;
	
	public Cocina() {
		this.ordenes = new ArrayList<Orden>();
		for(int i = 1; i <= CANTIDAD_ORDENES; i++) {
			Orden orden = new Orden(i);
			this.ordenes.add(orden);
		}

	}
	
	public Cocina(ArrayList<Orden> o) {
		
		this.ordenes = o;
		
	}
	
	/*public void revisarOrdenes() {
		
	}*/
	
}

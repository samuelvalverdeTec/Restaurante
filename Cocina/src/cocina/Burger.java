package cocina;

import java.util.ArrayList;

public class Burger {

	String nombre;
	String torta;
	String queso;
	String salsa;
	ArrayList<String> ingredientes = new ArrayList<String>();
	
	public Burger() {
		
	}
	
	public Burger(ArrayList<String> specs) {
		
		this.ingredientes = specs;
		
	}

}

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
	
	public String toString() {

		StringBuffer display = new StringBuffer();
		display.append("---- " + nombre + " ----\n");
		display.append(torta + "\n");
		display.append(queso + "\n");
		display.append(salsa + "\n");
		for (String i : ingredientes) {
			display.append(i + "\n");
		}
		return display.toString();
	}

}

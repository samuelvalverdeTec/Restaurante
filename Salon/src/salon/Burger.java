package salon;

import java.util.ArrayList;

public class Burger {

	public String nombre;
	public String torta;
	public String queso;
	public String salsa;
	public ArrayList<String> ingredientes = new ArrayList<String>();
	
	public int precio;
	
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
	
	public void printDatosBurger() {
		System.out.println(" Hamburguesa " + this.nombre);
		System.out.println(" --ingredientes extra--");
		System.out.println("  1. " + this.ingredientes.get(0));
		System.out.println("  2. " + this.ingredientes.get(1));
		System.out.println("  3. " + this.ingredientes.get(2));
		System.out.println("_________________________________________________");
	}

}

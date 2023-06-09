package salon;

import java.util.ArrayList;
import java.util.Random;

public class Burger {

	public String nombre;
	public String torta;
	public String queso;
	public String salsa;
	public ArrayList<String> ingredientes = new ArrayList<String>();
	public String datos;
	
	public int precio;
	
	Random rand = new Random();
	
	public Burger() {
		
	}
	
	public Burger(ArrayList<String> specs) {
		
		/*this.ingredientes.add(specs.get(rand.nextInt(1, 7)));
		this.ingredientes.add(specs.get(rand.nextInt(1, 7)));
		this.ingredientes.add(specs.get(rand.nextInt(1, 7)));*/
		
		this.ingredientes = specs;
		
	}
	
	public String toString() {

		StringBuffer display = new StringBuffer();
		display.append("---- " + nombre + " ----\n");
		display.append("\nTorta: " + torta);
		display.append("\nQueso: " + queso);
		display.append("\nSalsa: " + salsa);
		for (String i : ingredientes) {
			display.append("\nExtra: " +  i);
		}
		return display.toString();
	}
	
	public void printDatosBurger() {
		
		datos = toString();
		System.out.println(datos);
		
	}
	
	public void printDatosBurger2() {
		System.out.println(" Hamburguesa " + this.nombre);
		System.out.println(" --ingredientes extra--");
		System.out.println("  1. " + this.ingredientes.get(0));
		System.out.println("  2. " + this.ingredientes.get(1));
		System.out.println("  3. " + this.ingredientes.get(2));
		System.out.println("_________________________________________________");
	}

}

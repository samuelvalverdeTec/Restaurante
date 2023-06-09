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
		
		this.ingredientes.add(specs.get(rand.nextInt(1, 7)));
		this.ingredientes.add(specs.get(rand.nextInt(1, 7)));
		this.ingredientes.add(specs.get(rand.nextInt(1, 7)));
		
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

}

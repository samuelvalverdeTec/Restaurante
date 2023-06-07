package salon;

import java.util.ArrayList;

public class BurgerTriple extends Burger {

	public BurgerTriple(ArrayList<String> specs) {

		super(specs);

		this.nombre = "Triple con Bacon";
		this.torta = "Carne";
		this.queso = "Provolone";
		this.salsa = "Salsa de Tomate";
		
	}

}

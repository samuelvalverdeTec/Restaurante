package salon;

import java.util.ArrayList;

public class BurgerSwiss extends Burger {

	public BurgerSwiss(ArrayList<String> specs) {
		
		super(specs);
		
		this.nombre = "Swiss";
		this.torta = "Carne";
		this.queso = "Provolone";
		this.salsa = "Mayo";
		
		this.precio = 3000;
	}

}

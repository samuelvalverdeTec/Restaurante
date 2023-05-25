package cocina;

import java.util.ArrayList;

public class BurgerSwiss extends Burger {

	public BurgerSwiss(ArrayList<String> specs) {
		
		super(specs);
		
		this.nombre = "Swiss";
		this.torta = "Carne";
		this.queso = "Provolone";
		this.salsa = "Mayo";
		
	}

}

package cocina;

import java.util.ArrayList;

public class BurgerHotChicken extends Burger {

	public BurgerHotChicken(ArrayList<String> specs) {
		
		super(specs);
		
		this.nombre = "Hot Chicken";
		this.torta = "Pollo";
		this.queso = "Cheddar";
		this.salsa = "Especial";
		
	}

}

package cocina;

import java.util.ArrayList;

public class BurgerFactory {

	public Burger crearBurger(String type, ArrayList<String> specs) {
		
		Burger burger = null;

		if (type.equals("Basica")) {
			burger = new BurgerBasic();
		} else if (type.equals("POO")) {
			burger = new BurgerPOO(specs);
		} else if (type.equals("Triple con Bacon")) {
			burger = new BurgerTriple(specs);
		} else if (type.equals("Swiss")) {
			burger = new BurgerSwiss(specs);
		} else if (type.equals("Hot Chicken")) {
			burger = new BurgerHotChicken(specs);
		}
		return burger;
	}
	
}

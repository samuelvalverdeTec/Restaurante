package salon;

import java.util.ArrayList;

public class Salon implements Constants {
	
	public ArrayList<Mesa> mesas;
	
	public Salon() {
		mesas = new ArrayList<Mesa>();
		for(int i = 1; i <= CANTIDAD_MESAS; i++) {
			Mesa nuevaMesa = new Mesa(i);
			this.mesas.add(nuevaMesa);
		}
	}

}

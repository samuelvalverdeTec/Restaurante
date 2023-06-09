package salon;

public class Controller {
	
	public Salon salon;
	public Interfaz interfaz;
	
	public Controller() {
		this.salon = new Salon();
		this.interfaz = new Interfaz(this.salon);
		simulacion();
	}
	
	public void simulacion() {
		/*for(int i = 0; i < this.salon.mesas.size(); i++) {
			System.out.println("Mesa: " + this.salon.mesas.get(i).getNumMesa());
		}*/
		while(true) {
			interfaz.refrescar();
		}
	}

}

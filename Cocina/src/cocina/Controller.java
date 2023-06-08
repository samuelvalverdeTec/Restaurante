package cocina;

public class Controller {

	public Cocina cocina;
	public Interfaz interfaz;
	
	public Controller() {
		this.cocina = new Cocina();
		this.interfaz = new Interfaz(this.cocina);
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

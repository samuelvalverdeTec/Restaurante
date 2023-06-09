package cocina;

public class Controller {

	public Cocina cocina;
	public Interfaz interfaz;
	public ServerCocina server;
	public ClientCocina cliente;
	
	public Controller() {
		this.cocina = new Cocina();
		this.interfaz = new Interfaz(this.cocina);
		this.server = new ServerCocina(this.cocina);
		this.cliente = new ClientCocina(this.cocina);
		Thread threadServidor = new Thread(server);
		Thread threadCliente = new Thread(cliente);
		threadServidor.start();
		threadCliente.start();
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

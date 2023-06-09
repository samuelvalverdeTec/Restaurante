package salon;

public class Controller {
	
	public Salon salon;
	public Interfaz interfaz;
	public ClientSalon cliente;
	public ServerSalon server;
	
	public Controller() {
		this.salon = new Salon();
		this.interfaz = new Interfaz(this.salon);
		this.cliente = new ClientSalon(this.salon);
		this.server = new ServerSalon(this.salon);
		Thread threadCliente = new Thread(cliente);
		Thread threadServidor = new Thread(server);
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

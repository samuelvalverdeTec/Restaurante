package cocina;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerCocina implements Runnable{

	Cocina cocina;
	
	Socket client;
    ServerSocket server;
    ObjectInputStream input;
	
	public ServerCocina(Cocina pCocina){
		//abrirConexion();
		this.cocina = pCocina;
    }
	
	public void abrirConexion(){
		//System.out.println(" Esperando cliente... ");
        try{
            server = new ServerSocket(5555);
            client = server.accept();
            ObjectOutputStream os = new ObjectOutputStream(client.getOutputStream());
            input = new ObjectInputStream(client.getInputStream());
            //str = (String)input.readObject();
            while(true) {
            	//m = (Mensaje)input.readObject();
            	int s = (int)input.readObject();
            	this.agregarOrden(s);
            	//System.out.println("Orden Mesa " + s);
            	//m = new Mensaje();
            	//m.set(s,0);
            	/*if (s.compareTo("a") == 0) {
            		m.set(true);
            		//System.out.println("Seteando en true");
            		etiqueta.activo = true;
            	}
            	else {
            		m.set(false);
            		//System.out.println("Seteando en false");
            		etiqueta.activo = false;
            	}*/
            	
            	//System.out.println("Recibe: " + m.estado);
            	//System.out.println("Recibe: " + m.msj);
                //etiqueta.activo = m.estado;
                //imprimir(m);
                /*try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {   
                    e.printStackTrace();
                }*/
            }
            
            //input.close();
            //client.close();
            //server.close();
            
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
	
	public void agregarOrden(int pNumMesa) {
		for(int i = 0; i < this.cocina.ordenes.size(); i++) {
			Orden ordenAct = this.cocina.ordenes.get(i);
			if(pNumMesa == ordenAct.getNumMesa()) {
				ordenAct.existe = true;
			}
		}
		//orden.mostrarInfo();
	}
	
	public void run() {
		abrirConexion();
	}
	
}

package salon;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class ServerSalon implements Runnable{
	
	Salon salon;
	
	Socket client;
    ServerSocket server;
    ObjectInputStream input;
    
    public ServerSalon(Salon pSalon) {
    	this.salon = pSalon;
    }
    
    public void abrirConexion(){
		//System.out.println(" Esperando cliente... ");
        try{
            server = new ServerSocket(7777);
            client = server.accept();
            ObjectOutputStream os = new ObjectOutputStream(client.getOutputStream());
            input = new ObjectInputStream(client.getInputStream());
            //str = (String)input.readObject();
            //System.out.println("clienteCocina conectado");
            while(true) {
            	//m = (Mensaje)input.readObject();
            	int numMesa = (int)input.readObject();
            	this.alistarOrden(numMesa);
            	//this.agregarOrden(s);
            	this.ordenRecibida(numMesa);
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
    
    public void ordenRecibida(int pNumMesa) {
		System.out.println("--------------------------");
		System.out.println("Devuelta Orden Mesa " + pNumMesa);
		System.out.println("--------------------------");
	}
    
    public void alistarOrden(int pNumMesa) {
    	for(int i = 0; i < this.salon.mesas.size(); i++) {
    		Mesa mesaAct = this.salon.mesas.get(i);
    		if(pNumMesa == mesaAct.getNumMesa()) {
    			mesaAct.getOrden().setLista(true);
    		}
    	}
    }
    
    public void run() {
		abrirConexion();
	}

}

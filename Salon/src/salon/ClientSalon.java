package salon;

import java.io.ObjectOutputStream;
import java.net.Socket;

public class ClientSalon implements Runnable{
	
	Salon salon;
	
	Socket client;
    ObjectOutputStream output;
	
	public ClientSalon(Salon pSalon) {
		//conectar();
		this.salon = pSalon;
	}
	
	public void conectar(){
        String str;
        int numMesa;
        //Orden ordenAct;
        Mesa mesaAct = null;
        try{
            client = new Socket("127.0.0.1", 5555);
            output = new ObjectOutputStream(client.getOutputStream());
            //output.writeObject(str);
            while(true) { 
            	for(int i = 0; i < this.salon.mesas.size(); i++) {
            		mesaAct = this.salon.mesas.get(i);
                	if(mesaAct.enviar) {
                		numMesa = mesaAct.getNumMesa();
                		//ordenAct = mesaAct.getOrden();
                		output.writeObject(numMesa);
                		//output.writeObject(ordenAct);
                        output.flush();
                        mesaAct.enviar = false;
                	}
            	}
            	/*if(boton.activo != m.estado) {
            		//System.out.println("Envia: " + boton.activo);
            		m.set(boton.activo);
            		if(boton.activo) {
            			m.set("a", 0);
            		}
            		else {
            			m.set("b", 1);
            		}
            		//System.out.println("enviando msg:" + m.msj);
            		output.writeObject(m.msj);
                    output.flush();
            	}*/
            	//m.set(boton.activo);
                //output.writeObject(m);
                //output.flush();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {   
                    e.printStackTrace();
                }
            }           
            //output.close();
            //client.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
	
	public void run() {
		conectar();
	}

}

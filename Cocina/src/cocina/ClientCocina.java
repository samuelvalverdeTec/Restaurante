package cocina;

import java.io.ObjectOutputStream;
import java.net.Socket;


public class ClientCocina implements Runnable{
	
	Cocina cocina;
	
	Socket client;
    ObjectOutputStream output;
    
    public ClientCocina(Cocina pCocina) {
    	this.cocina = pCocina;
    }
    
    public void conectar(){
        String str;
        int numMesa;
        //Orden ordenAct;
        Orden ordenAct = null;
        try{
        	while(true) {
        		try {
        			client = new Socket("127.0.0.1", 7777);
        			break;
        		}
        		catch(Exception e){
                    //System.out.println(e);
                    Thread.sleep(2000);
                }
        	}
            //client = new Socket("127.0.0.1", 7777);
            output = new ObjectOutputStream(client.getOutputStream());
            //output.writeObject(str);
            while(true) { 
            	for(int i = 0; i < this.cocina.ordenes.size(); i++) {
            		ordenAct = this.cocina.ordenes.get(i);
                	if(ordenAct.ready) {
                		numMesa = ordenAct.getNumMesa();
                		//ordenAct = mesaAct.getOrden();
                		output.writeObject(numMesa);
                		//output.writeObject(ordenAct);
                        output.flush();
                        ordenAct.ready = false;
                        //ordenAct.existe = false;
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

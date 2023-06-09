package simulacion;

public class Simulacion extends Thread {
	
	public Simulacion() {
		
		start();
		
	}
	
	public void run() {
		
		while(true) {
        	try {
        		
        		Orden orden = new Orden();
        		orden.burger = orden.generarOrden();
            	// enviar orden
            
        		Thread.sleep(10000);		// 10 segundos
            
        	} catch (InterruptedException e) {
        		e.printStackTrace();
        	}
		}
    }
	
}

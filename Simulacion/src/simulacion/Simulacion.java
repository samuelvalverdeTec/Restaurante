package simulacion;

public class Simulacion extends Thread {
	
	private Orden orden;
	
	public Simulacion() {
		
		this.orden = new Orden();
		start();
		
	}
	
	public void run() {
		
		while(true) {
        	try {
        		
        		orden.burger = orden.generarOrden();
            	// enviar orden
            
        		Thread.sleep(10000);		// 10 segundos
            
        	} catch (InterruptedException e) {
        		e.printStackTrace();
        	}
		}
    }
	
}

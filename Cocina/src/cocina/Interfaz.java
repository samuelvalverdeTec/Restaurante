package cocina;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Interfaz implements Constants {

	JFrame frame;
	JPanel panel;
	JPanel panelOrden;
	JButton ordenes[][];
	Cocina cocina;
	
	public Interfaz(Cocina c) {
		
		this.cocina = c;
		this.ordenes = new JButton[CANTIDAD_ORDENES][1];
		
		this.frame = new JFrame("Cocina");
		this.panel = new JPanel();
		this.panelOrden = new JPanel();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
	}
	
	public void refrescar() {/*
		Mesa mesaAct = null;
		for(int f = 0; f < salon.mesas.size(); f++){
        	mesaAct = salon.mesas.get(f);
        	mesaAct.refrescar(panel);
	    }*/
	}
	
}

package cocina;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Interfaz implements ActionListener {

	JFrame frame;
	JPanel panel;
	JButton ordenes[][];
	Cocina cocina;
	
	public Interfaz(Cocina c) {
		
		this.cocina = c;
		this.ordenes = new JButton[cocina.ordenes.size()][1];
		
		this.frame = new JFrame("Cocina");
		this.panel = new JPanel();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		panel.setLayout(new GridLayout(cocina.ordenes.size(), 1));
		
		for(int f = 0; f < cocina.ordenes.size(); f++){
            JButton orden = cocina.ordenes.get(f).botonOrden;
            ordenes[f][0] = orden;
            panel.add(orden);
	    }
		
		frame.pack();
	    frame.setVisible(true);
	    
	    frame.setFocusable(true);
	    frame.requestFocus();
		
	}
	
	public void refrescar() {/*
		Mesa mesaAct = null;
		for(int f = 0; f < salon.mesas.size(); f++){
        	mesaAct = salon.mesas.get(f);
        	mesaAct.refrescar(panel);
	    }*/
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

package salon;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Interfaz implements Constants{
	
	JFrame frame;
	JFrame frameOrden;
	JPanel panelMesas;
	JPanel panel;
	JPanel panelOrden;
	JButton mesas[][];
	Salon salon;
	
	public Interfaz(Salon pSalon) {
		this.salon = pSalon;
		this.mesas = new JButton[CANTIDAD_MESAS][1];
		
		this.frame = new JFrame("Salon");
		this.panelMesas = new JPanel();
		this.panel = new JPanel();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		panelMesas.setLayout(new GridLayout(CANTIDAD_MESAS, 1));
		panel.setLayout(new GridLayout(CANTIDAD_MESAS*2, 1));
		
		for(int f = 0; f < salon.mesas.size(); f++){
            JButton mesa = salon.mesas.get(f).boton;
            JButton ordenarMesa = salon.mesas.get(f).botonOrdenar;
            JButton facturarMesa = salon.mesas.get(f).botonFacturar;
            mesas[f][0] = mesa;
            panelMesas.add(mesa);
            panel.add(ordenarMesa);
            panel.add(facturarMesa);
	    }
		
		frame.add(panelMesas, BorderLayout.WEST);
		frame.add(panel, BorderLayout.CENTER);
	    frame.pack();
	    frame.setVisible(true);
	    
	    frame.setFocusable(true);
	    frame.requestFocus();
	    
	    //refrescar();
	}
	
	public void refrescar() {
		Mesa mesaAct = null;
		for(int f = 0; f < salon.mesas.size(); f++){
        	mesaAct = salon.mesas.get(f);
        	mesaAct.refrescar(/*panel*/);
	    }
	}
	
	/*public void ordenar(int pNumMesa) {		
		Mesa mesaAct = null;
		for(int f = 0; f < salon.mesas.size(); f++){
        	mesaAct = salon.mesas.get(f);
        	mesaAct.ordenar();
	    }
		this.frameOrden = new JFrame("Orden Mesa " + pNumMesa);
		this.panelOrden = new JPanel();
	}*/



}

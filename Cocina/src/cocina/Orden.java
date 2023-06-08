package cocina;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Orden implements ActionListener{

	public boolean ready = false;
	private int numOrden;
	private int numMesa;
	public JButton botonOrden;
	
	public Orden() {
		
		this.botonOrden = new JButton("Orden: " + this.numOrden + ", Mesa: " + this.numMesa);
		this.botonOrden.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		this.ready = true;
		
	}
	
}

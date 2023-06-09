package cocina;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Orden implements ActionListener{

	public boolean existe = false;
	public boolean ready = false;
	private int numOrden;
	private int numMesa;
	public JButton botonOrden;
	
	public Orden(int pNumMesa) {
		this.setNumMesa(pNumMesa);
		
		this.botonOrden = new JButton(/*"Orden: " + this.numOrden +*/ "Orden Mesa " + this.getNumMesa());
		this.botonOrden.addActionListener(this);
		
	}
	
	public void mostrarInfo() {
		System.out.println("Numero de Orden-Mesa " + this.getNumMesa());
	}
	
	public void refrescar() {
		if(this.existe) {
			this.botonOrden.setBackground(Color.GREEN);
		}
		else {
			this.botonOrden.setBackground(Color.RED);
		}
	}
	
	public void setNumMesa(int pNumMesa) {
		this.numMesa = pNumMesa;
	}
	public int getNumMesa() {
		return this.numMesa;
	}
	
	public void marcarLista() {
		this.ready = true;
		this.existe = false;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.marcarLista();		
	}
	
}

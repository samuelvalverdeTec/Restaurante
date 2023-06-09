package salon;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
//import javax.swing.JPanel;

import javax.swing.JOptionPane;

public class Mesa implements ActionListener{
	
	private int numMesa;
	public boolean abierta = false;
	public boolean desplegado = false;
	private boolean ocupada = false;
	public boolean enviar = false;
	private Orden orden = null;
	public JButton boton;
	public JButton botonOrdenar;
	public JButton botonFacturar;
	
	public Mesa(int pNumMesa) {
		this.setNumMesa(pNumMesa);
		//this.setOrden(new Orden(this.getNumMesa()));
		this.boton = new JButton("Mesa: " + this.getNumMesa());
		//this.boton.addActionListener(this);
        //this.boton.setActionCommand("abrir");
        this.botonOrdenar = new JButton("ORDENAR-Mesa: " + this.getNumMesa());
        this.botonOrdenar.addActionListener(this);
        this.botonOrdenar.setActionCommand("ocupar");
        this.botonFacturar = new JButton("FACTURAR-Mesa: " + this.getNumMesa());
        this.botonFacturar.addActionListener(this);
        this.botonFacturar.setActionCommand("liberar");
	}
	
	public void refrescar(/*JPanel panel*/) {
		/*if(this.abierta) {
			if(!this.desplegado) {
				panel.add(botonOrdenar);
	        	panel.add(botonFacturar);
	        	this.desplegado = true;
			}	
		}
		else {
			if(this.desplegado) {
				panel.remove(botonOrdenar);
				panel.remove(botonFacturar);
				this.desplegado = false;
			}
		}*/
		if(this.ocupada) {
			this.boton.setBackground(Color.RED);
		}
		else {
			this.boton.setBackground(Color.GREEN);
		}
		/*if(this.getOrden().getLista()) {
			this.botonFacturar.setBackground(Color.GREEN);
		}
		else {
			this.botonFacturar.setBackground(Color.RED);
		}*/
	}
	
	public void ordenar() {
		this.setOcupada(true);
		Orden ordenAct = new Orden(this.getNumMesa());
		ArrayList<String> specs = new ArrayList<String>();
		String ingrediente = "";
		String orden = "";
		orden = JOptionPane.showInputDialog(null, "Hamburguesa a ordenar: ", "Orden Mesa " + this.getNumMesa(), 1);
		//System.out.println(orden);
		for(int i = 0; i < 3; i++) {
			ingrediente = JOptionPane.showInputDialog(null, "Ingrediente extra: ", "Ingredientes", 1);
			//System.out.println(ingrediente);
			specs.add(ingrediente);
		}
		this.setOrden(ordenAct.crearOrden(orden, specs));
		this.enviar = true;
		//String ingrediente = JOptionPane.showInputDialog(null, "Ingrediente extra: ", "Ingredientes", 1);
		/*if(orden == "Basica") {
			this.setOrden(ordenAct.crearOrden(orden, specs));
		}
		else if(orden == "POO") {
			this.setOrden(ordenAct.crearOrden(orden, specs));
		}
		else if(orden == "Triple con Bacon") {
			this.setOrden(ordenAct.crearOrden(orden, specs));
		}
		else if(orden == "Swiss") {
			this.setOrden(ordenAct.crearOrden(orden, specs));
		}
		else if(orden == "Hot Chicken") {
			this.setOrden(ordenAct.crearOrden(orden, specs));
		}
		else {
			JOptionPane.showMessageDialog(null, "Esta hamburguesa no se ofrece", "Orden Mesa " + this.getNumMesa(), 1, null);
		}*/
		//System.out.println("se crea bien la orden");
	}
	
	public void facturar() {
		if(this.getOrden() != null) {
			if(this.getOrden().getLista()) {
				this.setOcupada(false);
				JOptionPane.showMessageDialog(null, "Precio total de la orden: " + this.orden.getPrecio(), "Factura Mesa " + this.getNumMesa(), 1, null);
				this.setOrden(null);
			}
			else {
				JOptionPane.showMessageDialog(null, "La orden no está lista todavía", "Factura Mesa " + this.getNumMesa(), 1, null);
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "Esta mesa no ha ordenado nada", "Factura Mesa " + this.getNumMesa(), 1, null);
		}
	}

	
	public void setNumMesa(int pNumMesa) {
		this.numMesa = pNumMesa;
	}
	public int getNumMesa() {
		return this.numMesa;
	}
	public void setOcupada(boolean pOcupada) {
		this.ocupada = pOcupada;
	}
	public boolean getOcupada() {
		return this.ocupada;
	}
	public void setOrden(Orden pOrden) {
		this.orden = pOrden;
	}
	public Orden getOrden() {
		return this.orden;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		/*if(e.getActionCommand().equals("abrir")){
    		this.boton.setActionCommand("cerrar");
    		this.abierta = true;
            //this.setOcupada(true);
        }
        else if(e.getActionCommand().equals("cerrar")){
        	this.boton.setActionCommand("abrir");
        	this.abierta = false;
        	//this.setOcupada(false);
        }
        else*/ if(e.getActionCommand().equals("ocupar")){
    		this.botonOrdenar.setActionCommand("ocupar");
            //this.setOcupada(true);
            ordenar();
        }
        else if(e.getActionCommand().equals("liberar")){
        	this.botonFacturar.setActionCommand("liberar");
        	//this.setOcupada(false);
        	facturar();
        }
	}

}

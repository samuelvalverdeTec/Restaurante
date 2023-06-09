package salon;

import java.util.ArrayList;

public class Orden {
	
	//private int numOrden;
	private int numMesa;
	//public ArrayList<Burger> hamburguesas;
	private Burger hamburguesa;
	private int precio = 0;
	private boolean lista = false;
	
	public Orden(int pNumMesa) {
		this.setNumMesa(pNumMesa);
	}
	
	public Orden crearOrden(String pOrden, ArrayList<String> specs) {
		BurgerFactory hamburguesaOrdenada = new BurgerFactory();
		this.setHamburguesa(hamburguesaOrdenada.crearBurger(pOrden, specs));
		this.setPrecio(this.getHamburguesa().precio);
		System.out.println("ORDEN MESA " + this.getNumMesa());
		this.hamburguesa.printDatosBurger();
		return this;
	}
	
	public void setNumMesa(int pNumMesa) {
		this.numMesa = pNumMesa;
	}
	public int getNumMesa() {
		return this.numMesa;
	}
	public void setHamburguesa(Burger pBurger) {
		this.hamburguesa = pBurger;
	}
	public Burger getHamburguesa() {
		return this.hamburguesa;
	}
	public void setPrecio(int pPrecio) {
		this.precio = pPrecio;
	}
	public int getPrecio() {
		return this.precio;
	}
	public void setLista(boolean pLista) {
		this.lista = pLista;
	}
	public boolean getLista() {
		return this.lista;
	}

	
}

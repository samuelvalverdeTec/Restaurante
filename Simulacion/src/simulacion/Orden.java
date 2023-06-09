package simulacion;

import java.util.ArrayList;
import java.util.Random;

import salon.Burger;
import salon.BurgerFactory;
import salon.Constants;

public class Orden implements Constants {

	public int numMesa;
	public Burger burger;
	public int precio = 0;
	public boolean lista = false;
	
	public BurgerFactory burgerFactory;
	public ArrayList<Orden> ordenes;
	public ArrayList<String> types;
	public ArrayList<String> specs;
	
	Random rand = new Random();
	
	public Orden() {
		
		this.numMesa = rand.nextInt(1, CANTIDAD_MESAS+1);
		this.types = setTypes();
		this.specs = setSpecs();
		//this.burger = generarOrden();
		
	}
	
	protected Burger generarOrden() {
		
		int type = rand.nextInt(1, 7);
		
		BurgerFactory bf = new BurgerFactory();
		Burger burger = bf.crearBurger(types.get(type), specs);
		
		return burger;
	}
	
	private ArrayList<String> setTypes() {
		
		types.add("");
		types.add("Basica");
		types.add("POO");
		types.add("Triple con Bacon");
		types.add("Swiss");
		types.add("Hot Chicken");
		return types;
		
	}
	
	private ArrayList<String> setSpecs() {
		
		specs.add("lechuga");
		specs.add("tomate");
		specs.add("cebolla");
		specs.add("pepinillos");
		specs.add("extra salsa");
		specs.add("bacon");
		return specs;
		
	}
	
	public void setPrecio(int pPrecio) {
		this.precio = pPrecio;
	}
	public int getPrecio() {
		return this.precio;
	}
	
}

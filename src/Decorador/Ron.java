package Decorador;

import Componentes_C.Cafe;

public class Ron extends Adiciones{
	public Ron (Cafe cafe) {
		super(cafe);
	}
	public int getprecio() {
		return getCafe().getprecio() + 2500;
	}
	public int getpreciopequeño() {
		// TODO Auto-generated method stub
		return getCafe().getpreciopequeño() + 2000;
	}
	public String getnombre() {
		return getCafe().getnombre()+" + Ron";
	}
}

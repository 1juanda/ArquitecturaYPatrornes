package Decorador;

import Componentes_C.Cafe;

public class Chantilly extends Adiciones {
	public Chantilly (Cafe cafe) {
		super(cafe);
	}
	public int getprecio() {
		return getCafe().getprecio() + 2700;
	}
	public int getpreciopequeño() {
		// TODO Auto-generated method stub
		return getCafe().getpreciopequeño() + 1700;
	}
	public String getnombre() {
		return getCafe().getnombre()+" + Chantilly";
	}

}

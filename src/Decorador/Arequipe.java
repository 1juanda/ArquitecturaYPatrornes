package Decorador;

import Componentes_C.Cafe;

public class Arequipe extends Adiciones {

	public Arequipe(Cafe cafe) {
		super(cafe);
	}
	public int getprecio() {
		return getCafe().getprecio() + 2300;
	}
	public int getpreciopequeño() {
		// TODO Auto-generated method stub
		return getCafe().getpreciopequeño() + 1500;
	}
	public String getnombre() {
		return getCafe().getnombre()+"+ Arequipe";
	}
	
}

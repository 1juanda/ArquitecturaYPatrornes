package Decorador;

import Componentes_C.Cafe;

public class Whisky extends Adiciones{
	public Whisky (Cafe cafe) {
		super(cafe);
	}
	public int getprecio() {
		return getCafe().getprecio() + 2300;
	}
	public int getpreciopeque�o() {
		// TODO Auto-generated method stub
		return getCafe().getpreciopeque�o() + 1600;
	}
	public String getnombre() {
		return getCafe().getnombre()+" + Whisky";
	}
}

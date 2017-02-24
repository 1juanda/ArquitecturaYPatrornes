package Decorador;

import Componentes_C.Cafe;

public  abstract class Adiciones implements Cafe{
	private Cafe cafe;
	public Adiciones (Cafe cafe){
		setCafe (cafe);
	}
	private void setCafe(Cafe cafe) {
		this.cafe=cafe;
	}
	public Cafe getCafe(){
		return cafe;
	}	
}

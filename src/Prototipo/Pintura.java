package Prototipo;

public class Pintura {
	
	Grafico grafico;
	
	public void setPrototipo(Grafico prototipo){
		this.grafico = prototipo;
	}
	
	public Grafico getNewInstance(){
		Grafico grafico2 = grafico.clone();
		return grafico2;
	}
}

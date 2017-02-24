package ObservadorSujeto;

import ObservadorObser.Observador;

public interface Sujeto {
	
	public void subscribirse(Observador observador);
	
	public void desubscribirse(Observador observador);
	
	public void getState();

}

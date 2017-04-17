package Fabrica;

public enum ConsolaTipo {
	play4,xbox;
	public static ConsolaTipo fromInteger(int x){
		switch (x) {
		case 1:
			return play4;
		case 2:
			return xbox;
		default:
			return null;
		}
	}
}

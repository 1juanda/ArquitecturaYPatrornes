package Fabrica;

public class Consolas {
	public Console create(ConsolaTipo consolestipo){
		try {
			switch(consolestipo){
			case play4:
				return new play4();
			case xbox:
				return new xbox();
			default:
				return null;
			}
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	public static ConsolaTipo fromInteger(int opc) {
		// TODO Auto-generated method stub
		return null;
	}
}


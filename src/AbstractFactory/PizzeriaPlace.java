package AbstractFactory;

public enum PizzeriaPlace {
	MARIO, LUIGI;

	public static PizzeriaPlace fromInteger(int x){
		switch (x) {
		case 1:
			return MARIO;
		case 2:
			return LUIGI;
		default:
			return null;
		}
	}

}

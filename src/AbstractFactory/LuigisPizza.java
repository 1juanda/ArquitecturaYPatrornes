package AbstractFactory;

public class LuigisPizza extends Pizzeria{
	
	@Override
	public String getMenu() {
		return "\n1. Champiñones \n2. Pepperoni";
		
	}

	@Override
	public Pizza getPizza(int option) {
		switch(option){
		case 1:
			return new Champinones();
		case 2:
			return new Pepperoni();
		default:
			return null;
		}
	}

}

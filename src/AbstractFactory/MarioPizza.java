package AbstractFactory;

public class MarioPizza extends Pizzeria{
	
	@Override
	public String getMenu() {
		return "\n1. Pollo \n2. Pepperoni";		
	}

	@Override
	public Pizza getPizza(int option) {
		switch(option){
		case 1:
			return new Pollo();
		case 2:
			return new Pepperoni();
		default:
			return null;
		}
	}


}

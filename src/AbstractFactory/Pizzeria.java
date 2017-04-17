package AbstractFactory;

public abstract class Pizzeria {
public static Pizzeria getFactory(PizzeriaPlace pizzeria){
		
		switch(pizzeria){
		case MARIO:
			return new MarioPizza();
		case LUIGI:
			return new LuigisPizza();
		default:
			return null;
		}
	} 
	
	public abstract String getMenu();
	public abstract Pizza getPizza(int option);

}

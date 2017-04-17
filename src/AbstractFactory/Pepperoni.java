package AbstractFactory;

import java.util.ArrayList;

public class Pepperoni extends Pizza{
	public Pepperoni(){
		ingredients = new ArrayList<String>();
		ingredients.add("Cheese");
		ingredients.add("Tomato");
		ingredients.add("Pepperoni");
	}

	@Override
	public void Produce() {
		System.out.println("Adding ingredients...");
		for(int i=0; i<ingredients.size(); i++){
			System.out.println(ingredients.get(i));
		}
		System.out.println("Putting in oven...");
		System.out.println("Baking...");
		try{
			Thread.sleep(5000);
			System.out.println("Your pizza is ready!");
		}
		catch(Exception e){
			e.printStackTrace();			
		}

	}
}


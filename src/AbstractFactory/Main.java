package AbstractFactory;

import java.io.*;

public class Main {

	public static void main(String[] args)  throws NumberFormatException, IOException{
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		Pizzeria myPizzeria;
		Pizza myPizza;
		System.out.println("--Bienvenido al menú de pizzerias--");
		System.out.println("Elija el lugar donde quiere comprar:\n1. Mario's Pizza\n2. Luigi's Pizza");
		int opc = Integer.parseInt(br.readLine());
		myPizzeria = Pizzeria.getFactory(PizzeriaPlace.fromInteger(opc));
		System.out.println("Elija la pizza que desea comprar: "+myPizzeria.getMenu());
		opc = Integer.parseInt(br.readLine());
		myPizza = myPizzeria.getPizza(opc);
		myPizza.Produce();

	}
}



package Fabrica;

import java.io.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException  {
		// TODO Auto-generated method stub

		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		Consolas consolas = new Consolas();
		Console console;
		int opc;
		do{
			System.out.println("Elija la consola que desea crear");
			System.out.println("\n1.Play 4 \n2.Xbox \n3.Salir");
			opc = Integer.parseInt(leer.readLine());
			console = consolas.create(ConsolaTipo.fromInteger(opc));
			if(console!=null){
				console.turnOn();
				console.play();
				console.turnOff();
			}

		}while(opc!=3);
	}

}

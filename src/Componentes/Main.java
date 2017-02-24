package Componentes;

import Componentes_C.*;
import Decorador.*;

public class Main {

	public static void main(String[] args) {
		Cafe cafe= new Expreso();
		cafe=new Arequipe(cafe);
		System.out.println("El pedido es: " + cafe.getnombre());
		System.out.println("El precio es: "+ cafe.getpreciopequeño());
		
		
		System.out.println("El pedido es: " + cafe.getnombre());
		System.out.println("El precio es: "+ cafe.getprecio());
		
	}

}

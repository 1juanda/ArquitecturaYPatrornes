package Singleton;

public class Main {

	public static void main(String[] args) {
	InstitutoEducativo ie= InstitutoEducativo.getInstance();
	int i=1;
	ie.setNombreinstituto("Sergio Arboleda");
	System.out.println(i++ +"." +ie.getNombreinstituto());
	
	InstitutoEducativo ie2= InstitutoEducativo.getInstance();
	ie2.setNombreinstituto("Nacional");
	System.out.println(i++ +"." +ie2.getNombreinstituto());
	
	}
}

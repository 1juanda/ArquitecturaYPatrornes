package Fabrica;

public class play4 extends Console {

	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Turning On Play4");
		try {
			System.out.println("WAIT");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Turning Off");
	}

	public void play() {
		// TODO Auto-generated method stub
		System.out.println("PLAY4");
	}
	
}

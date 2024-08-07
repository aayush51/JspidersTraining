package Synchro;

public class Division implements Runnable {
	
	@Override
	public void run() {
		
		
		Arithmath a = new Arithmath();
		a.c = a.a / a.b;
		System.out.println("Divion:"+a.c);
		
	}

}

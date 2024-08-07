package Synchro;

public class Subtract implements Runnable {

	@Override
	public void run() {
		synchronized (this) {
			Arithmath a = new Arithmath();
			a.c = a.a - a.b;
			System.out.println("Subtract:"+a.c);
		}
		
	}

}

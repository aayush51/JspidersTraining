package Synchro;

public class Addition implements Runnable {

	@Override
	public void run() {
		synchronized (this) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Arithmath a = new Arithmath();
			a.c = a.a + a.b;
			System.out.println("Addition:"+a.c);
		}
		
	}
	
}

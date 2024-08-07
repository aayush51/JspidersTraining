package Synchro;

public class Arithmath  {
	int a = 5 ;
	int b = 2 ;
	volatile int c ;
	
	public Arithmath() {
		super();
	}

	public Arithmath(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public static void main(String[] args) throws InterruptedException {
		
			
			Runnable r1 = new Addition();
			Thread t1 = new Thread(r1,"Addition");
			Runnable r2 = new Subtract();
			Thread t2 = new Thread(r2,"Subtract");
			Runnable r3 = new Multiplication();
			Thread t3 = new Thread(r3,"Multiplication");
			Runnable r4 = new Division();
			Thread t4 = new Thread(r4,"Division");
			
			
//			t1.setDaemon(true);
//			t2.setDaemon(true);
//			t3.setDaemon(true);
//			t4.setDaemon(true);
			

//			System.out.println(Thread.holdsLock(t3));
			
			t1.start();
//			t1.join(0);
			t2.start();
//			t2.join(0);
			t3.start();
//			t3.join(0);
			t4.start();
//			t4.join(0);
			
			System.out.println(Thread.activeCount());
			System.out.println(Thread.getAllStackTraces());
//			Thread.yield();
			System.out.println();
			
			
//			t1.run();
//			t2.run();
//			t3.run();
//			t4.run();
			
//			try {
//				t1.join(0);
//				t2.join(0);
//				t3.join(0);
//				t4.join(0);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("MAIN END");
			
	}

}
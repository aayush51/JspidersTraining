package ExceptionHandlingBeta;

public class ThreadExample {
	public static void main(String[] args) {
		MyThread obj1 = new MyThread();
		obj1.start();
		Thread.currentThread().getName();
		Thread.currentThread().setName("Hello");
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}

}


class MyThread extends Thread {
	@Override
	public void run() {
		Thread.currentThread().setName("Bye");
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}
}
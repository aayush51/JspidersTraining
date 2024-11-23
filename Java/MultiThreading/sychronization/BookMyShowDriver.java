package sychronization;

class BookMyShow {
	int totalSeats = 10 ;
	public synchronized void bookTicket(int seat) {
		if(totalSeats >= seat) {
			System.out.println(seat + " seats Booked");
			totalSeats-=seat;
			System.out.println(totalSeats + " seats available");
		}
		else {
			System.out.println(seat + " seats not booked");
			System.out.println(totalSeats +" seats available");
		}
	}
}

class MyThread extends Thread {
	static BookMyShow bms;
	int seat;
	@Override
	public void run() {
		bms.bookTicket(seat);
	}
}

public class BookMyShowDriver {
	public static void main(String[] args) {
		MyThread.bms = new BookMyShow();
		MyThread person1 = new MyThread();
		person1.seat = 7 ;
		person1.start();
		
		MyThread person2 = new MyThread();
		person2.seat = 5 ;
		person2.start();
		
		MyThread person3 = new MyThread();
		person3.seat = 6 ;
		person3.start();
	}
}

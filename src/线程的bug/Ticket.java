package 线程的bug;

public class Ticket {

	private int count = 1000;
	
	public void saleTicket() {
		if(count > 0) {
			System.out.println(Thread.currentThread().getName() + ": " + count);
			count--;
		}
	}
}

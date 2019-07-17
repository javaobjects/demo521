package 线程的bug;

public class Ticket {

	private int count = 1000;
	
	public synchronized void saleTicket() {//解决bug上锁 加关键字synchronized
		if(count > 0) {
			System.out.println(Thread.currentThread().getName() + ": " + count);
			count--;
		}
	}
}

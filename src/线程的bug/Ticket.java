package 线程的bug;

public class Ticket {

	private int count = 1000;
	
	public synchronized void saleTicket() {//解决bug方法一：上锁 加关键字synchronized
//		synchronized (this) {//解决bug方法二：锁住共享对象
			if(count > 0) {
				System.out.println(Thread.currentThread().getName() + ": " + count);
				count--;
			}
//		}
	}
}

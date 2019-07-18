package 线程的bug;

//import java.util.concurrent.locks.Lock;//解决bug方法三：使用Lock对象
//import java.util.concurrent.locks.ReentrantLock;//解决bug方法三：使用Lock对象

public class Ticket {

	private int count = 1000;
	
//	private Lock lock = new ReentrantLock();//解决bug方法三：使用Lock对象
	
	public synchronized void saleTicket() {//解决bug方法一：上锁 加关键字synchronized
		if(count > 0) {
			System.out.println(Thread.currentThread().getName() + ": " + count);
			count--;
		}
	}
	
//	public void saleTicket() {
//		synchronized (this) {//解决bug方法二：锁住共享对象
//			if(count > 0) {
//				System.out.println(Thread.currentThread().getName() + ": " + count);
//				count--;
//			}
//		}
//	}
	
//	public void saleTicket() {//解决bug方法三：使用Lock对象
//		lock.lock();//上锁
//		if(count > 0) {
//			System.out.println(Thread.currentThread().getName() + ": " + count);
//			count--;
//		}
//		lock.unlock();//解锁
//	}
	
	//会产生bug
//	public void saleTicket() {
//		if(count > 0) {
//			System.out.println(Thread.currentThread().getName() + ": " + count);
//			count--;
//		}
//	}
}

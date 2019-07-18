package 线程的通信;

public class Bread {
	
	private boolean flag = false;//默认没有面包
	//生产面包的方法
	public synchronized void produce(int i) {
		//如果没有面包那么就生产面包，生产完后通知所有线程
		if(!flag) {
			System.out.println(Thread.currentThread().getName() + i +" 生产面包");
			flag = true;
			this.notifyAll();//生产完后通知所有监视当前对象的线程
		}else {
			//如果有面包，就等待
			try {
				System.out.println(Thread.currentThread().getName() + i + " 阻塞");
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	//消费面包的方法
	public synchronized void consumer(int i) {
		//如果有面包那么就消费面包，消费完后通知所有线程，消费面包
		if(flag) {
			System.out.println(Thread.currentThread().getName() + i + " 消费面包");
			flag = false;
			this.notifyAll();//消费完后通知所有监视当前对象的线程
		}else {
			//如果没有面包，就等待
			try {
				System.out.println(Thread.currentThread().getName() + i + " 阻塞");
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

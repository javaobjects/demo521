package 线程的bug;

public class Test {

	public static void main(String[] args) {
		
		Ticket t = new Ticket();
		/**
		 * 出现bug：卖了三张同样的票
		 * 1、三个线程操作的是同一个对象
		 * 2、
		 */
		SaleTicket s1 = new SaleTicket(t);
		new Thread(s1).start();
		SaleTicket s2 = new SaleTicket(t);
		new Thread(s2).start();
		SaleTicket s3 = new SaleTicket(t);
		new Thread(s3).start();

//		SaleTicket s1 = new SaleTicket(1, 100);
//		new Thread(s1).start();
//		SaleTicket s2 = new SaleTicket(101, 200);
//		new Thread(s2).start();
//		SaleTicket s3 = new SaleTicket(201, 300);
//		new Thread(s3).start();
		
		
		
		/*
	 	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			if(count>0)
		{
			System.out.println(Thread.currentThread().getName()+":"+count);
			count--;
		}
		}
	}
	 
	 */
	}
}

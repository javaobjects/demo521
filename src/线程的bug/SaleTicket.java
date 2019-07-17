package 线程的bug;
/**
 * 
* <p>Title: SaleTicket</p>  
* <p>
* 	Description: 
*  推荐：以后创建线程类建议通过实现接口的方式创建
*  原因：1.Java是单继承
*  		 2.语义好
* </p>  
* @author xianxian 
* @date 2019年7月17日
 */
public class SaleTicket implements Runnable{

	private Ticket ticket;
	
	public SaleTicket(Ticket ticket) {
		this.ticket = ticket;
	}
//	private int startNumber;
//	private int endNumber;
//	
//	public  SaleTicket(int startNumber,int endNumber) {
//		this.startNumber = startNumber;
//		this.endNumber = endNumber;
//	}
	
	
//	@Override
//	public void run() {
//		for (int i = this.startNumber; i <= this.endNumber; i++) {
//			System.out.println(Thread.currentThread().getName() + ": " + i);
//		}
//	}
	
	@Override
	public void run() {
		for (int i = 1; i <= 1000; i++) {
			System.out.println(Thread.currentThread().getName() + ": " + i);
		}
	}

}

package 创建线程类的三种方式;
/**
 * 
* <p>Title: Test1</p>  
* <p>
* 	Description: 
* 测试第一种方式创建的线程类
* </p>  
* @author xianxian 
* @date 2019年7月17日
 */
public class Test1 {

	public static void main(String[] args) {
		SaleTicket1 s1 = new SaleTicket1();
		Thread t1 = new Thread(s1);
//		t1.setPriority(Thread.MAX_PRIORITY);//设置优先级 1-10
		System.out.println("t1.getPriority():" + t1.getPriority());//优先级默认是5
		t1.start();
		
		SaleTicket1 s2 = new SaleTicket1();
		Thread t2 = new Thread(s2);
//		t2.setPriority(Thread.MIN_PRIORITY);//设置优先级
		System.out.println("t2.getPriority():" + t2.getPriority());//优先级默认是5
		t2.start();
	}
}

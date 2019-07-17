package 创建线程类的三种方式;
/**
 * 
* <p>Title: Test1</p>  
* <p>
* 	Description: 
* 测试第二种方式创建的线程类
* </p>  
* @author xianxian 
* @date 2019年7月17日
 */
public class Test2 {

	public static void main(String[] args) {
		SaleTicket2 s1 = new SaleTicket2();
		s1.start();
		
		try {
			s1.join();//调用join方法的子线程先执行完，再执行主线程，会让线程从并发变成顺序执行
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		SaleTicket2 s2 = new SaleTicket2();
		s2.start();
		
		try {
			s2.join();//调用join方法的子线程先执行完，再执行主线程，会让线程从并发变成顺序执行
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "," + i);
		}
	}
}

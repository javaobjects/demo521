package 创建线程类的三种方式;
/**
 * 
* <p>Title: SaleTicket2</p>  
* <p>
* 	Description: 
* 创建线程类的第二种方式：
* 继承Thread类
* </p>  
* @author xianxian 
* @date 2019年7月17日
 */
public class SaleTicket2 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i <= 100; i++) {
			System.out.println(Thread.currentThread().getName() + "打印票号：" + i);
		}
	}
}

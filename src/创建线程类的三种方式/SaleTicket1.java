package 创建线程类的三种方式;
/**
 * 
* <p>Title: SaleTicket</p>  
* <p>
* Description: 
* 创建线程类的第一种方式:
* 实现Runable接口
* </p>  
* @author xianxian 
* @date 2019年7月17日
 */
public class SaleTicket1 implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i <= 100; i++) {
			System.out.println(Thread.currentThread().getName() + "打印票号：" + i);
		}
	}
}

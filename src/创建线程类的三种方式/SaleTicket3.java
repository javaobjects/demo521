package 创建线程类的三种方式;

import java.util.concurrent.Callable;
/**
 * 
* <p>Title: SaleTicket3</p>  
* <p>
* 	Description: 
* 有返回值的线程类
* </p>  
* @author xianxian 
* @date 2019年7月17日
 */
public class SaleTicket3 implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		for (int i = 0; i <= 100; i++) {
			System.out.println(Thread.currentThread().getName() + "打印票号：" + i);
		}
		return 0;
	}
}

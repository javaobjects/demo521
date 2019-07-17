package 创建线程类的三种方式;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 
* <p>Title: Test1</p>  
* <p>
* 	Description: 
* 测试第三种方式创建的线程类
* </p>  
* @author xianxian 
* @date 2019年7月17日
 */
public class Test3 {

	public static void main(String[] args) {
		SaleTicket3 s1 = new SaleTicket3();
		FutureTask<Integer> ft1 = new FutureTask<Integer>(s1);
		
		SaleTicket3 s2 = new SaleTicket3();
		FutureTask<Integer> ft2 = new FutureTask<Integer>(s2);
		
		for (int i = 1; i <= 100; i++) {
			System.out.println("主线程打印输出："+i);
			if(i==20)
			{
				new Thread(ft1, "线程1").start();//线程就绪
			}
			if(i==30)
			{
				new Thread(ft2, "线程2").start();//线程就绪
			}
		}
		//获取线程的运行结果
		try {
			System.out.println("ft1:"+ft1.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println("ft2:"+ft2.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}

}

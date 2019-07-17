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
		
		SaleTicket2 s2 = new SaleTicket2();
		s2.start();
	}
}

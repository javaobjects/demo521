package 线程的通信;
/**
 * 
* <p>Title: ConsumerThread</p>  
* <p>
* 	Description: 
* 	消费线程
* </p>  
* @author xianxian 
* @date 2019年7月18日
 */
public class ConsumerThread implements Runnable {

	private Bread bread;
	
	public ConsumerThread(Bread bread) {
		this.bread = bread;
	}
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			bread.consumer(i);//消费面包
		}
	}

}

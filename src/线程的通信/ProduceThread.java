package 线程的通信;

/**
 * 
* <p>Title: ProduceThread</p>  
* <p>
* 	Description: 
* 生产线程
* </p>  
* @author xianxian 
* @date 2019年7月18日
 */
public class ProduceThread implements Runnable{

	private Bread bread;
	
	public ProduceThread(Bread bread) {
		this.bread = bread;
	}
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			bread.produce(i);//生产面包
		}
	}
}

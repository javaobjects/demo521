package 线程的通信;

public class Test {

	public static void main(String[] args) {
		Bread bread = new Bread();
		
		ProduceThread p1 = new ProduceThread(bread);
		new Thread(p1,"生产线程1 ").start();
		
		ProduceThread p2 = new ProduceThread(bread);
		new Thread(p2,"生产线程2 ").start();
		
		ConsumerThread c1 = new ConsumerThread(bread);
		new Thread(c1,"消费线程1 ").start();
		
		ConsumerThread c2 = new ConsumerThread(bread);
		new Thread(c2,"消费线程2 ").start();
	}
}

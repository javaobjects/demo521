package 网络编程;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestClient {

	public static void main(String[] args) {

		//创建服务端套接字
		try {
			Socket client = new Socket("localhost",5791);
			System.out.println("hello server......");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

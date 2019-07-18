package 网络编程;

import java.io.IOException;
import java.net.ServerSocket;

public class TestServer {

	public static void main(String[] args) {
 
		ServerSocket server;
		try {
			server = new ServerSocket(4004);
			server.accept();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

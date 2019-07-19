package chat1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {

	public static void main(String[] args) {
		//创建服务端套接字
		ServerSocket server = null;
		
		try {
			server = new ServerSocket(50000);
			//获取客户端的套接字实例
			Socket client = server.accept();//侦听
			
			try(
					BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
					PrintWriter pw = new PrintWriter(client.getOutputStream(),true);
					){
				String message = br.readLine();
				System.out.println("client: " + message);
				System.out.println("server: " + "在");
				pw.write("在");
				pw.flush();
			}catch(Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

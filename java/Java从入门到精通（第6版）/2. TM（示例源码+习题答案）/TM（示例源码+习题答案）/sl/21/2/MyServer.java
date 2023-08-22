
import java.io.*;
import java.net.*;

public class MyServer {
	private ServerSocket server; // 服务器套接字
	private Socket socket; // 客户端套接字

	void start() {// 启动服务器
		try {
			server = new ServerSocket(8998); // 服务器启用8998端口
			System.out.println("服务器套接字已经创建成功");
			while (true) {
				System.out.println("等待客户端的连接");
				socket = server.accept(); // 服务器监听客户端连接
				// 根据套接字字节流创建字符输入流
				BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				while (true) {// 循环接受信息
					String message = reader.readLine();// 读取一行文本
					if ("exit".equals(message)) {// 如果客户端发来的内容为“exit”
						System.out.println("客户端退出");
						break;// 停止接受信息
					}
					System.out.println("客户端:" + message);
				}
				reader.close(); // 关闭流
				socket.close(); // 关闭套接字
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		MyServer tcp = new MyServer();
		tcp.start(); // 启动服务器
	}
}

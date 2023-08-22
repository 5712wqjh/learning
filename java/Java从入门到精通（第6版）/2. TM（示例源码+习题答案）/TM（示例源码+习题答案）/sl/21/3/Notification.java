
import java.io.IOException;
import java.net.*;

public class Notification extends Thread {
	String weather = "节目预报：八点有大型晚会，请收听";// 发送的消息
	int port = 9898; // 端口
	InetAddress iaddress = null;
	MulticastSocket socket = null; // 多点广播套接字

	Notification() {
		try {
			iaddress = InetAddress.getByName("224.255.10.0"); // 实例化InetAddress，指定地址
			socket = new MulticastSocket(port); // 实例化多点广播套接字
			socket.setTimeToLive(1); // 指定发送范围是本地网络
			socket.joinGroup(iaddress); // 加入广播组
		} catch (IOException e) {
			e.printStackTrace(); // 输出异常信息
		}
	}

	public void run() {
		while (true) {
			DatagramPacket packet = null; // 数据包
			byte data[] = weather.getBytes(); // 字符串消息的字节数组
			packet = new DatagramPacket(data, data.length, iaddress, port); // 将数据打包
			System.out.println(weather); // 控制台打印消息
			try {
				socket.send(packet); // 发送数据
				sleep(3000); // 线程休眠
			} catch (IOException e) {
				e.printStackTrace(); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) { 
		Notification w = new Notification();
		w.start(); // 启动线程
	}
}


import java.io.IOException;
import java.net.*;

public class Notification extends Thread {
	String weather = "��ĿԤ�����˵��д�����ᣬ������";// ���͵���Ϣ
	int port = 9898; // �˿�
	InetAddress iaddress = null;
	MulticastSocket socket = null; // ���㲥�׽���

	Notification() {
		try {
			iaddress = InetAddress.getByName("224.255.10.0"); // ʵ����InetAddress��ָ����ַ
			socket = new MulticastSocket(port); // ʵ�������㲥�׽���
			socket.setTimeToLive(1); // ָ�����ͷ�Χ�Ǳ�������
			socket.joinGroup(iaddress); // ����㲥��
		} catch (IOException e) {
			e.printStackTrace(); // ����쳣��Ϣ
		}
	}

	public void run() {
		while (true) {
			DatagramPacket packet = null; // ���ݰ�
			byte data[] = weather.getBytes(); // �ַ�����Ϣ���ֽ�����
			packet = new DatagramPacket(data, data.length, iaddress, port); // �����ݴ��
			System.out.println(weather); // ����̨��ӡ��Ϣ
			try {
				socket.send(packet); // ��������
				sleep(3000); // �߳�����
			} catch (IOException e) {
				e.printStackTrace(); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) { 
		Notification w = new Notification();
		w.start(); // �����߳�
	}
}

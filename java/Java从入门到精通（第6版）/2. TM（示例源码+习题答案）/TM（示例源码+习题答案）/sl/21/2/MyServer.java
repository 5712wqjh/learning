
import java.io.*;
import java.net.*;

public class MyServer {
	private ServerSocket server; // �������׽���
	private Socket socket; // �ͻ����׽���

	void start() {// ����������
		try {
			server = new ServerSocket(8998); // ����������8998�˿�
			System.out.println("�������׽����Ѿ������ɹ�");
			while (true) {
				System.out.println("�ȴ��ͻ��˵�����");
				socket = server.accept(); // �����������ͻ�������
				// �����׽����ֽ��������ַ�������
				BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				while (true) {// ѭ��������Ϣ
					String message = reader.readLine();// ��ȡһ���ı�
					if ("exit".equals(message)) {// ����ͻ��˷���������Ϊ��exit��
						System.out.println("�ͻ����˳�");
						break;// ֹͣ������Ϣ
					}
					System.out.println("�ͻ���:" + message);
				}
				reader.close(); // �ر���
				socket.close(); // �ر��׽���
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		MyServer tcp = new MyServer();
		tcp.start(); // ����������
	}
}

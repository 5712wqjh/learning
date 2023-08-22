
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.Socket;
import javax.swing.*;

public class MyClient extends JFrame {
	private PrintWriter writer;// �����׽����ֽ����������ַ������
	Socket socket; // �ͻ����׽���
	private JTextArea area = new JTextArea();// չʾ��Ϣ���ı���
	private JTextField text = new JTextField(); // ������Ϣ���ı���

	public MyClient() {
		setTitle("�������������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane(); // ������
		JScrollPane scrollPane = new JScrollPane(area);// �������
		getContentPane().add(scrollPane, BorderLayout.CENTER);
		c.add(text, "South"); // ���ı�����ڴ�����²�
		text.addActionListener(new ActionListener() {// �ı��򴥷��س��¼�
			public void actionPerformed(ActionEvent e) {
				writer.println(text.getText().trim()); // ���ı����е���Ϣд����
				area.append(text.getText() + '\n'); // ���ı����е���Ϣ��ʾ���ı�����
				text.setText(""); // ���ı������
			}
		});
	}

	private void connect() { // ���ӷ���������
		area.append("��������\n"); // �ı�������ʾ��Ϣ
		try {
			socket = new Socket("127.0.0.1", 8998); // ���ӱ��ؼ������8998�˿�
			writer = new PrintWriter(socket.getOutputStream(), true);
			area.append("�������\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		MyClient clien = new MyClient();
		clien.setSize(200, 200); // �����С
		clien.setVisible(true); // ��ʾ����
		clien.connect(); // ���ӷ�����
	}
}

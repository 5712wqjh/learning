
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.Socket;
import javax.swing.*;

public class MyClient extends JFrame {
	private PrintWriter writer;// 根据套接字字节流创建的字符输出流
	Socket socket; // 客户端套接字
	private JTextArea area = new JTextArea();// 展示信息的文本域
	private JTextField text = new JTextField(); // 发送信息的文本框

	public MyClient() {
		setTitle("向服务器送数据");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane(); // 主容器
		JScrollPane scrollPane = new JScrollPane(area);// 滚动面板
		getContentPane().add(scrollPane, BorderLayout.CENTER);
		c.add(text, "South"); // 将文本框放在窗体的下部
		text.addActionListener(new ActionListener() {// 文本框触发回车事件
			public void actionPerformed(ActionEvent e) {
				writer.println(text.getText().trim()); // 将文本框中的信息写入流
				area.append(text.getText() + '\n'); // 将文本框中的信息显示在文本域中
				text.setText(""); // 将文本框清空
			}
		});
	}

	private void connect() { // 连接服务器方法
		area.append("尝试连接\n"); // 文本域中提示信息
		try {
			socket = new Socket("127.0.0.1", 8998); // 连接本地计算机的8998端口
			writer = new PrintWriter(socket.getOutputStream(), true);
			area.append("完成连接\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		MyClient clien = new MyClient();
		clien.setSize(200, 200); // 窗体大小
		clien.setVisible(true); // 显示窗体
		clien.connect(); // 连接服务器
	}
}

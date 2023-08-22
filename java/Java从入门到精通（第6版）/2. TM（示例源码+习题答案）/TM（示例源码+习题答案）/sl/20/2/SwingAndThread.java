import java.awt.Container;
import javax.swing.*;

public class SwingAndThread extends JFrame {
	int count = 0; // ͼ�������

	public SwingAndThread() {
		setBounds(300, 200, 250, 100); // ���Զ�λ�����С��λ��
		Container container = getContentPane();// ������
		container.setLayout(null); // ʹ���岻ʹ���κβ��ֹ�����

		Icon icon = new ImageIcon("src/1.gif"); // ͼ�����
		JLabel jl = new JLabel(icon);// ��ʾͼ��ı�ǩ
		jl.setBounds(10, 10, 200, 50); // ���ñ�ǩ��λ�����С
		Thread t = new Thread() { // ���������̶߳���
			public void run() {
				while (true) {
					jl.setBounds(count, 10, 200, 50); // ����ǩ�ĺ������ñ�����ʾ
					try {
						Thread.sleep(500); // ʹ�߳�����500����
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					count += 4; // ʹ������ÿ������4
					if (count >= 200) {
						// ��ͼ�굽���ǩ�����ұ�ʱ��ʹ��ص���ǩ�����
						count = 10;
					}
				}
			}
		};
		t.start(); // �����߳�
		container.add(jl); // ����ǩ��ӵ�������
		setVisible(true); // ʹ����ɼ�
		// ���ô���Ĺرշ�ʽ
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new SwingAndThread(); // ʵ����һ��SwingAndThread����
	}
}

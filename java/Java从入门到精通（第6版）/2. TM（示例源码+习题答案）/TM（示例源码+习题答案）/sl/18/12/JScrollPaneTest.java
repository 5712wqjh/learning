

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class JScrollPaneTest extends JFrame {
	public JScrollPaneTest() {
		Container c = getContentPane(); // ��ȡ������
		// �����ı��������,�ı���Ĭ�ϴ�СΪ20�С�50��
		JTextArea ta = new JTextArea(20, 50);
		// ����JScrollPane������壬�����ı���ŵ����������
		JScrollPane sp = new JScrollPane(ta);
		c.add(sp); // ���������ӵ���������
		setTitle("�������������ֱ�����");
		setSize(400, 200);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}

	public static void main(String[] args) {
		JScrollPaneTest test = new JScrollPaneTest();
		test.setVisible(true);
	}
}

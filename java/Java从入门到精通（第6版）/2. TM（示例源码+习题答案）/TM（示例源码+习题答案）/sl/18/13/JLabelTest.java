
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class JLabelTest extends JFrame {
	public JLabelTest() {
		Container container = getContentPane();
		// ����һ����ǩ
		JLabel jl = new JLabel("����һ��JFrame����");
		container.add(jl); // ����ǩ��ӵ�������
		setSize(200, 100); // ���ô����С
		// ���ô���ر�ģʽ
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true); // ʹ����ɼ�
	}

	public static void main(String args[]) {
		new JLabelTest(); // ����MyImageIcon����
	}
}

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyJDialog extends JDialog { // �Զ���Ի����࣬�̳�JDialog
	public MyJDialog(MyFrame frame) {
		// ���ø��๹�췽������һ�������Ǹ����壬�ڶ��������Ǵ�����⣬������������ʾ����������
		super(frame, "��һ��JDialog����", true);
		Container container = getContentPane(); // ��ȡ������
		container.add(new JLabel("����һ���Ի���")); // ����������ӱ�ǩ
		setBounds(120, 120, 100, 100); // ���öԻ�������������ʾ������ʹ�С
	}
}

public class MyFrame extends JFrame { // �Զ��崰���࣬�̳�JFrame
	public MyFrame() {// ����Ĺ��췽��
		Container container = getContentPane(); // ��ô���������
		container.setLayout(null); // ����ʹ�þ��Բ���
		JButton bl = new JButton("�����Ի���"); // ����һ����ť
		bl.setBounds(10, 10, 100, 21); // ���尴ť�������е�����ʹ�С
		bl.addActionListener(new ActionListener() { // Ϊ��ť��ӵ���¼�
			public void actionPerformed(ActionEvent e) {// ����¼������ķ���
				MyJDialog dialog = new MyJDialog(MyFrame.this); // ����MyJDialo�Ի���
				dialog.setVisible(true); // ʹ�Ի���ɼ�
			}
		});
		container.add(bl); // ����ť��ӵ�������
		setSize(200, 200); // ����Ŀ��
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // �رմ�����ֹͣ����
		setVisible(true); // ʹ����ɼ�
	}

	public static void main(String args[]) {
		new MyFrame();
	}
}

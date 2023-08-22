
import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEventDemo extends JFrame { // �̳д�����JFrame

	public static void main(String args[]) {
		MouseEventDemo frame = new MouseEventDemo();
		frame.setVisible(true); // ���ô���ɼ���Ĭ��Ϊ���ɼ�
	}

	/**
	 * �жϰ��µ��������������Ӧ��ʾ
	 * 
	 * @param e ����¼�
	 */
	private void mouseOper(MouseEvent e) {
		int i = e.getButton(); // ͨ����ֵ�����жϰ��µ����ĸ���
		if (i == MouseEvent.BUTTON1)
			System.out.println("���µ���������");
		else if (i == MouseEvent.BUTTON2)
			System.out.println("���µ���������");
		else if (i == MouseEvent.BUTTON3)
			System.out.println("���µ�������Ҽ�");
	}

	public MouseEventDemo() {
		super(); // �̳и���Ĺ��췽��
		setTitle("����¼�ʾ��"); // ���ô���ı���
		setBounds(100, 100, 500, 375); // ���ô������ʾλ�ü���С
		// ���ô���رհ�ť�Ķ���Ϊ�˳�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		final JLabel label = new JLabel();
		label.addMouseListener(new MouseListener() {
			public void mouseEntered(MouseEvent e) {// ����������ʱ������
				System.out.println("����������");
			}

			public void mousePressed(MouseEvent e) {// ��갴��������ʱ������
				System.out.print("��갴�������£�");
				mouseOper(e);
			}

			public void mouseReleased(MouseEvent e) {// ��갴�����ͷ�ʱ������
				System.out.print("��갴�����ͷţ�");
				mouseOper(e);
			}

			public void mouseClicked(MouseEvent e) {// ���������¼�ʱ������
				System.out.print("��������갴����");
				mouseOper(e);
				int clickCount = e.getClickCount();// ��ȡ��굥������
				System.out.println("��������Ϊ" + clickCount + "��");
			}

			public void mouseExited(MouseEvent e) {// ����Ƴ����ʱ������
				System.out.println("����Ƴ����");
			}
		});
		getContentPane().add(label, BorderLayout.CENTER);
		//
	}

}

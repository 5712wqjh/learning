
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxTest extends JFrame {
	public CheckBoxTest() {
		setBounds(100, 100, 170, 110); // ��������ʹ�С
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane(); // ��ȡ������
		c.setLayout(new FlowLayout()); // ����ʹ��������
		JCheckBox c1 = new JCheckBox("1"); // ������ѡ��
		JCheckBox c2 = new JCheckBox("2");
		JCheckBox c3 = new JCheckBox("3");
		c.add(c1); // ������Ӹ�ѡ��
		c.add(c2);
		c.add(c3);
		JButton btn = new JButton("��ӡ"); // ������ӡ��ť
		btn.addActionListener(new ActionListener() { // ��ӡ��ť�����¼�
			public void actionPerformed(ActionEvent e) {
				// �ڿ���̨�ֱ����������ѡ���ѡ��״̬
				System.out.println(c1.getText() + "��ťѡ��״̬��" + c1.isSelected());
				System.out.println(c2.getText() + "��ťѡ��״̬��" + c2.isSelected());
				System.out.println(c3.getText() + "��ťѡ��״̬��" + c3.isSelected());
			}
		});
		c.add(btn); // ������Ӵ�ӡ��ť
		setVisible(true);
	}

	public static void main(String[] args) {
		new CheckBoxTest();
	}
}

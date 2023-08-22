import java.awt.*;
import javax.swing.*;

public class BorderLayoutPosition extends JFrame {
	public BorderLayoutPosition() {
		setTitle("�������ʹ�ñ߽粼�ֹ�����");
		Container c = getContentPane(); // ��ȡ������
		setLayout(new BorderLayout()); // ����ʹ�ñ߽粼��
		JButton centerBtn = new JButton("��");
		JButton northBtn = new JButton("��");
		JButton southBtn = new JButton("��");
		JButton westBtn = new JButton("��");
		JButton eastBtn = new JButton("��");
		c.add(centerBtn, BorderLayout.CENTER); // �в���Ӱ�ť
		c.add(northBtn, BorderLayout.NORTH); // ������Ӱ�ť
		c.add(southBtn, BorderLayout.SOUTH); // �ϲ���Ӱ�ť
		c.add(westBtn, BorderLayout.WEST); // ������Ӱ�ť
		c.add(eastBtn, BorderLayout.EAST); // ������Ӱ�ť
		setSize(350, 200); // ���ô����С
		setVisible(true); // ���ô���ɼ�
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE); // �رմ�����ֹͣ����
	}

	public static void main(String[] args) {
		new BorderLayoutPosition();
	}
}

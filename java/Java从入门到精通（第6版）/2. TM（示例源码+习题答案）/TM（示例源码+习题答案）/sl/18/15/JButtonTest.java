import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JButtonTest extends JFrame {
	public JButtonTest() {
		Icon icon = new ImageIcon("src/imageButtoo.jpg"); // ��ȡͼƬ�ļ�
		setLayout(new GridLayout(3, 2, 5, 5)); // �������񲼾ֹ�����
		Container c = getContentPane(); // ��ȡ������
		JButton btn[] = new JButton[6]; // ������ť����
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(); // ʵ���������еĶ���
			c.add(btn[i]); // ����ť��ӵ�������
		}
		btn[0].setText("������");
		btn[0].setEnabled(false); // ���ð�ť������
		btn[1].setText("�б���ɫ");
		btn[1].setBackground(Color.YELLOW);
		btn[2].setText("�ޱ߿�");
		btn[2].setBorderPainted(false); // ���ð�ť�߿���ʾ
		btn[3].setText("�б߿�");
		btn[3].setBorder(BorderFactory.createLineBorder(Color.RED)); // ��Ӻ�ɫ���ͱ߿�
		btn[4].setIcon(icon); // Ϊ��ť����ͼ��
		btn[4].setToolTipText("ͼƬ��ť"); // ���������ͣʱ��ʾ������
		btn[5].setText("�ɵ��");
		btn[5].addActionListener(new ActionListener() { // Ϊ��ť��Ӽ����¼�
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(JButtonTest.this, "�����ť"); // ����ȷ�϶Ի���
			}
		});
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setTitle("������ͬ��ʽ�İ�ť");
		setBounds(100, 100, 400, 200);
	}

	public static void main(String[] args) {
		new JButtonTest();
	}
}


import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Characters extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		Characters frame = new Characters();
		frame.setVisible(true);
	}

	public Characters() {
		setTitle("��а�����ϵ۱�ؤ����ͨ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel label = new JLabel("��ؤ�������߹�");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label, BorderLayout.NORTH);
		
		JLabel label_1 = new JLabel("�ϵۡ���������");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label_1, BorderLayout.SOUTH);
		
		JLabel label_2 = new JLabel("��������ŷ����");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label_2, BorderLayout.WEST);
		
		JLabel label_3 = new JLabel("��а������ҩʦ");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label_3, BorderLayout.EAST);
		
		JLabel label_4 = new JLabel("����ͨ����������");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label_4, BorderLayout.CENTER);
	}
}

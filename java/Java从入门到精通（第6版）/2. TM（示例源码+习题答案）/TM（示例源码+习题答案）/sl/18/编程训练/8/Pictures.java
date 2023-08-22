
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Pictures extends JFrame { // ����һ����ͼƬ���࣬���̳�JFrame

	private JPanel contentPane; // ����һ��JPanel���contentPane

	/**
	 * ������
	 */
	public static void main(String[] args) {
		Pictures frame = new Pictures(); // ����Pictures����
		frame.setVisible(true); // ʹframe����
	}

	/**
	 * ����JFrame����
	 */
	public Pictures() { // Pictures�Ĺ��췽��
		setTitle("����л������Ĵ���"); // ���ô�����Ŀ
		setResizable(false); // ���ɸı䴰���С
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���ô���رյķ�ʽ
		setBounds(100, 100, 500, 336); // ���ô����С
		/**
		 * ����JPanel���contentPane����JFrame�����У����������ı߾�Ͳ���(���Բ���)
		 */
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		/**
		 * ������ǩlblBackground�������contentPane�У����ñ�ǩ�Ĵ�С�Լ����ǩ�����ͼ��
		 */
		JLabel lblBackground = new JLabel("");
		Random random = new Random(); // ����Random����
		int num = random.nextInt(3); // �������0-3��������3���е�����
		switch (num) { // ���֧���
		case 0: // ���ɵ������Ϊ��0��ʱ
			lblBackground.setIcon(new ImageIcon(Pictures.class.getResource("1.png"))); // ͼ�������ͼƬ��Birds.jpg��
			break;
		case 1: // ���ɵ������Ϊ��1��ʱ
			lblBackground.setIcon(new ImageIcon(Pictures.class.getResource("2.png"))); // ͼ�������ͼƬ��Snow.jpg��
			break;
		case 2: // ���ɵ������Ϊ��2��ʱ
			lblBackground.setIcon(new ImageIcon(Pictures.class.getResource("3.png"))); // ͼ�������ͼƬ��Trees.jpg��
			break;
		}
		lblBackground.setBounds(0, 0, 494, 308);
		contentPane.add(lblBackground);
	}
}

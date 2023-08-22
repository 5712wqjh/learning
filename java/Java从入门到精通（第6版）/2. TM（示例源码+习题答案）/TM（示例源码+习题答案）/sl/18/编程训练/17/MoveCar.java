
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MoveCar extends JFrame { // ����һ����Ų�����࣬���̳�JFrame
	// ���������е����
	private JPanel contentPane;
	private JLabel lblCarImage;

	/**
	 * ������
	 */
	public static void main(String[] args) {
		MoveCar frame = new MoveCar(); // ����MoveCar����
		frame.setVisible(true); // ʹframe����
	}

	/**
	 * ����JFrame����
	 */
	public MoveCar() { // MoveCar�Ĺ��췽��
		setResizable(false); // ���ô��岻�ɸı��С
		setTitle("������������"); // ���ô�����Ŀ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���ô���رյķ�ʽ
		setBounds(100, 100, 590, 300); // ���ô����С
		/**
		 * ����JPanel���contentPane����JFrame�����У����������ı���ɫ���߾�Ͳ���
		 */
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		/**
		 * ������ťbtnFront�������contentPane�У����ð�ť�Ĵ�С����ť�е��������ݺ���ʽ
		 */
		JButton btnFront = new JButton("ǰ����");
		btnFront.addActionListener(new ActionListener() { // ��Ӷ����������¼�
			@Override
			public void actionPerformed(ActionEvent e) { // ��������ʱ
				lblCarImage.setHorizontalAlignment(SwingConstants.TRAILING); // �Ǳ�ǩ�е�ͼ���ƶ���β��
			}
		});
		btnFront.setFont(new Font("��Բ", Font.PLAIN, 14));
		btnFront.setBounds(10, 229, 108, 23);
		contentPane.add(btnFront);
		/**
		 * ������ťbtnBack�������contentPane�У����ð�ť�Ĵ�С����ť�е��������ݺ���ʽ
		 */
		JButton btnBack = new JButton("����");
		btnBack.addActionListener(new ActionListener() { // ��Ӷ����������¼�
			@Override
			public void actionPerformed(ActionEvent e) { // ��������ʱ
				lblCarImage.setHorizontalAlignment(SwingConstants.LEADING); // �Ǳ�ǩ�е�ͼ���ƶ����ײ�
			}
		});
		btnBack.setFont(new Font("��Բ", Font.PLAIN, 14));
		btnBack.setBounds(165, 229, 108, 23);
		contentPane.add(btnBack);
		/**
		 * ������ǩlblCarImage�������contentPane�У����ñ�ǩ��С��ͼ���Լ�ͼ���λ��
		 */
		lblCarImage = new JLabel("");
		lblCarImage.setHorizontalAlignment(SwingConstants.LEFT);
		lblCarImage.setIcon(new ImageIcon(MoveCar.class.getResource("car.png")));
		lblCarImage.setBounds(10, 10, 564, 209);
		contentPane.add(lblCarImage);
		/**
		 * ������ťbtnUp�������contentPane�У����ð�ť�Ĵ�С����ť�е��������ݺ���ʽ
		 */
		JButton btnUp = new JButton("�ϡ���");
		btnUp.addActionListener(new ActionListener() { // ��Ӷ����������¼�
			@Override
			public void actionPerformed(ActionEvent e) { // ��������ʱ
				lblCarImage.setVerticalAlignment(SwingConstants.TOP); // �Ǳ�ǩ�е�ͼ���ƶ����ϲ�
			}
		});
		btnUp.setFont(new Font("��Բ", Font.PLAIN, 14));
		btnUp.setBounds(318, 229, 108, 23);
		contentPane.add(btnUp);
		/**
		 * ������ťbtnDown�������contentPane�У����ð�ť�Ĵ�С����ť�е��������ݺ���ʽ
		 */
		JButton btnDown = new JButton("�¡���");
		btnDown.addActionListener(new ActionListener() { // ��Ӷ����������¼�
			@Override
			public void actionPerformed(ActionEvent e) { // ��������ʱ
				lblCarImage.setVerticalAlignment(SwingConstants.BOTTOM); // �Ǳ�ǩ�е�ͼ���ƶ����ײ�
			}
		});
		btnDown.setFont(new Font("��Բ", Font.PLAIN, 14));
		btnDown.setBounds(466, 229, 108, 23);
		contentPane.add(btnDown);
	}
}

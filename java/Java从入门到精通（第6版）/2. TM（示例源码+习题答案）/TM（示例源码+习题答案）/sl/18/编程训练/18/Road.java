
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Road extends JFrame { // �������ֵ�����̳�JFrame
	// ���������еĳ�Ա���
	private JPanel contentPane;
	private JLabel lblMap;
	private JLabel btnDirection;
	private JButton btnGo;

	/**
	 * ������
	 */
	public static void main(String[] args) {
		Road frame = new Road(); // ����Road����
		frame.setVisible(true); // ʹframe����
	}

	/**
	 * ����JFrame����
	 */
	public Road() { // Road�Ĺ��췽��
		setTitle("�鿴ȫ����ͼ���������������ϣ���������������"); // ���ô�����Ŀ
		setResizable(false); // ���ɸı䴰����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���ô���رյķ�ʽ
		setBounds(300, 150, 499, 409); // ���ô����λ�úͿ��
		/**
		 * ����JPanel���contentPane����JFrame�����У����������ı���ɫ���߾�Ͳ���
		 */
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		/**
		 * ������ǩlabel�������contentPane�У����ñ�ǩ��λ�á�����Լ�ͼ�꣨ˮƽ���У�
		 */
		lblMap = new JLabel("");
		lblMap.setHorizontalAlignment(SwingConstants.CENTER);
		lblMap.setIcon(new ImageIcon(Road.class.getResource("5.png")));
		lblMap.setBounds(0, 0, 493, 280);
		contentPane.add(lblMap);
		/**
		 * ������ťbutton�������contentPane�У����ð�ť��λ�á�����Լ���ť����������ݺ���ʽ
		 */
		String strDirect = "·�ڱ���";// ��¼����
		btnGo = new JButton("����ȫ��ģʽ");
		btnGo.addMouseListener(new MouseAdapter() { // ��ť�������¼��ļ���
			@Override
			public void mouseClicked(MouseEvent e) { // ��ť�����굥���¼��ļ���
				btnGo.setText("�ѽ��뵽ȫ��ģʽ"); // �������ð�ť�е���������
				lblMap.setIcon(new ImageIcon(Road.class.getResource("1.png"))); // ���ñ�ǩlabel���ͼ��
				btnDirection.setHorizontalAlignment(SwingConstants.CENTER); // ���ñ�ǩlabel_1�����������ˮƽ����
				btnDirection.setText("��ǰλ�ã�" + strDirect); // ���ñ�ǩlabel_1�����������
			}
		});
		btnGo.addKeyListener(new KeyAdapter() { // ��ť�����¼��ļ���
			@Override
			public void keyPressed(KeyEvent e) { // ��ť��Ӽ��̱�����ʱ�ļ���
				String strDirect = "·�ڱ���";
				switch (e.getKeyCode()) { // ���֧��䣨ͨ����getKeyCode()��������밴���������������
				case KeyEvent.VK_UP: // ��������ϡ�
					lblMap.setIcon(new ImageIcon(Road.class.getResource("1.png"))); // ���ñ�ǩlabel���ͼ��
					btnDirection.setHorizontalAlignment(SwingConstants.CENTER); // ���ñ�ǩlabel_1�����������ˮƽ����
					strDirect = "·�ڱ���"; // ���ñ�ǩlabel_1�����������
					break;
				case KeyEvent.VK_DOWN: // ��������¡�
					lblMap.setIcon(new ImageIcon(Road.class.getResource("2.png"))); // ���ñ�ǩlabel���ͼ��
					btnDirection.setHorizontalAlignment(SwingConstants.CENTER); // ���ñ�ǩlabel_1�����������ˮƽ����
					strDirect = "·���ϲ�"; // ���ñ�ǩlabel_1�����������
					break;
				case KeyEvent.VK_LEFT: // ���������
					lblMap.setIcon(new ImageIcon(Road.class.getResource("3.png"))); // ���ñ�ǩlabel���ͼ��
					btnDirection.setHorizontalAlignment(SwingConstants.CENTER); // ���ñ�ǩlabel_1�����������ˮƽ����
					strDirect = "·������"; // ���ñ�ǩlabel_1�����������
					break;
				case KeyEvent.VK_RIGHT: // ��������ҡ�
					lblMap.setIcon(new ImageIcon(Road.class.getResource("4.png"))); // ���ñ�ǩlabel���ͼ��
					btnDirection.setHorizontalAlignment(SwingConstants.CENTER); // ���ñ�ǩlabel_1�����������ˮƽ����
					strDirect = "·�ڶ���"; // ���ñ�ǩlabel_1�����������
					break;
				}
				btnDirection.setText("��ǰλ�ã�" + strDirect);
			}
		});
		btnGo.setFont(new Font("΢���ź�", Font.PLAIN, 14));
		btnGo.setBounds(180, 290, 150, 35);
		contentPane.add(btnGo);
		/**
		 * ������ǩlabel_1�������contentPane�У����ñ�ǩ��λ�á�����Լ���ǩ����������ݺ���ʽ
		 */
		btnDirection = new JLabel("");
		btnDirection.setFont(new Font("΢���ź�", Font.PLAIN, 14));
		btnDirection.setBounds(150, 335, 209, 35);
		contentPane.add(btnDirection);
	}
}


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;

public class TraficLights extends JFrame { // ����һ������ͨ�ơ��࣬���̳�JFrame
	// ���������е����
	private JPanel contentPane;
	private JLabel lblImage;

	/**
	 * ������
	 */
	public static void main(String[] args) {
		TraficLights frame = new TraficLights(); // ����TraficLights����
		frame.setVisible(true); // ʹframe����
	}

	/**
	 * ����JFrame����
	 */
	public TraficLights() { // TraficLights�Ĺ��췽��
		setResizable(false); // ���ô��岻�ɸı��С
		setTitle("��ͨ��"); // ���ô�����Ŀ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���ô���رյķ�ʽ
		setBounds(100, 100, 220, 300); // ���ô����С
		/**
		 * ����JPanel���contentPane����JFrame�����У����������ı���ɫ���߾�Ͳ���
		 */
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		/**
		 * �������panel����l���contentPane�У��������panel�ı���ɫ��TitledBorder�����֣��߽粼�֣�
		 */
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new TitledBorder(null, "��ͨ��", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		/**
		 * ������ǩlblImage�������panel�е��м䣬���ñ�ǩ�ı���ɫ��ͼ��
		 */
		lblImage = new JLabel("");
		lblImage.setBackground(Color.WHITE);
		lblImage.setIcon(new ImageIcon(TraficLights.class.getResource("green.png")));
		panel.add(lblImage, BorderLayout.CENTER);
		/**
		 * �������panel_1����l���contentPane�У��������panel_1��TitledBorder�����֣����Բ��֣�
		 */
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "��ͨ�Ƶ���ɫ", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		/**
		 * ������ѡ��ťrbtnRed�������panel_1�У����õ�ѡ��ť��textֵ����С
		 */
		JRadioButton rbtnRed = new JRadioButton("���");
		rbtnRed.addActionListener(new ActionListener() { // ��Ӷ����������¼�
			@Override
			public void actionPerformed(ActionEvent e) { // ��������ʱ
				lblImage.setIcon(new ImageIcon(TraficLights.class.getResource("red.png"))); // ��ǩ�����ͼƬ
			}
		});
		rbtnRed.setBounds(20, 51, 60, 20);
		panel_1.add(rbtnRed);
		/**
		 * ������ѡ��ťrbtnYellow�������panel_1�У����õ�ѡ��ť��textֵ����С
		 */
		JRadioButton rbtnYellow = new JRadioButton("�Ƶ�");
		rbtnYellow.addActionListener(new ActionListener() { // ��Ӷ����������¼�
			@Override
			public void actionPerformed(ActionEvent e) { // ��������ʱ
				lblImage.setIcon(new ImageIcon(TraficLights.class.getResource("yellow.png"))); // ��ǩ�����ͼƬ
			}
		});
		rbtnYellow.setBounds(20, 117, 60, 20);
		panel_1.add(rbtnYellow);
		/**
		 * ������ѡ��ťrbtnGreen�������panel_1�У����õ�ѡ��ť��textֵ����С
		 */
		JRadioButton rbtnGreen = new JRadioButton("�̵�");
		rbtnGreen.setSelected(true); // ���ð�ťradioButton_2ΪĬ�ϵĵ�ѡ��ť
		rbtnGreen.addActionListener(new ActionListener() { // ��Ӷ����������¼�
			@Override
			public void actionPerformed(ActionEvent e) { // ��������ʱ
				lblImage.setIcon(new ImageIcon(TraficLights.class.getResource("green.png"))); // ��ǩ�����ͼƬ
			}
		});
		rbtnGreen.setBounds(20, 182, 60, 20);
		panel_1.add(rbtnGreen);
		/**
		 * ����ButtonGroup����group���ѵ�ѡ��ťrbtnRed��rbtnYellow��rbtnGreen�Ž�group��
		 */
		ButtonGroup group = new ButtonGroup();
		group.add(rbtnRed);
		group.add(rbtnYellow);
		group.add(rbtnGreen);
	}
}


import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class RoadMap extends JFrame { // ����һ����·��ͼ���࣬���̳�JFrame
	// ���������е����
	private JPanel contentPane;
	/**
	 * ������
	 */
	public static void main(String[] args) {
		RoadMap frame = new RoadMap(); // ����RoadMap����
		frame.setVisible(true); // ʹframe����
	}
	/**
	 * ����JFrame����
	 */
	public RoadMap() { // RoadMap�Ĺ��췽��
		setResizable(false); // ���ɸı䴰���С
		setTitle("ʮ��·���ĸ�����ĳ�����ͼ"); // ���ô�����Ŀ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���ô���رյķ�ʽ
		setBounds(100, 100, 561, 404); // ���ô����С
		/**
		 * ����JPanel���contentPane����JFrame�����У����������ı߾�Ͳ���
		 */
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(2, 2, 0, 0));
		/**
		 * ����JPanel���panelNorth�������contentPane�У����������panelNorth�Ĳ���
		 */
		JPanel panelNorth = new JPanel();
		contentPane.add(panelNorth);
		panelNorth.setLayout(new BorderLayout(0, 0));
		/**
		 * ������ǩlabelNorth�������panelNorth���м䣬��Ϊ��ǩ���ͼ��
		 */
		JLabel labelNorth = new JLabel("");
		labelNorth.setIcon(new ImageIcon(RoadMap.class.getResource("1.png")));
		panelNorth.add(labelNorth, BorderLayout.CENTER);
		/**
		 * ������ǩlabelNImage�������panelNorth���ϲ࣬���ñ�ǩlabelNImage��textֵ��text�ڱ�ǩ�е�λ��
		 */
		JLabel labelNImage = new JLabel("����·��");
		labelNImage.setHorizontalAlignment(SwingConstants.CENTER);
		panelNorth.add(labelNImage, BorderLayout.SOUTH);
		/**
		 * ����JPanel���panelSouth�������contentPane�У����������panelSouth�Ĳ���
		 */
		JPanel panelSouth = new JPanel();
		contentPane.add(panelSouth);
		panelSouth.setLayout(new BorderLayout(0, 0));
		/**
		 * ������ǩlabelSouth�������panelSouth���м䣬��Ϊ��ǩ���ͼ��
		 */
		JLabel labelSouth = new JLabel("");
		labelSouth.setIcon(new ImageIcon(RoadMap.class.getResource("2.png")));
		panelSouth.add(labelSouth, BorderLayout.CENTER);
		/**
		 * ������ǩlabelSImage�������panelSouth���ϲ࣬���ñ�ǩlabelSImage��textֵ��text�ڱ�ǩ�е�λ��
		 */
		JLabel labelSImage = new JLabel("�ϲ�·��");
		labelSImage.setHorizontalAlignment(SwingConstants.CENTER);
		panelSouth.add(labelSImage, BorderLayout.SOUTH);
		/**
		 * ����JPanel���panelWest�������contentPane�У����������panelWest�Ĳ���
		 */
		JPanel panelWest = new JPanel();
		contentPane.add(panelWest);
		panelWest.setLayout(new BorderLayout(0, 0));
		/**
		 * ������ǩlabelWest�������panelWest���м䣬��Ϊ��ǩ���ͼ��
		 */
		JLabel labelWest = new JLabel("");
		labelWest.setIcon(new ImageIcon(RoadMap.class.getResource("3.png")));
		panelWest.add(labelWest, BorderLayout.CENTER);
		/**
		 * ������ǩlabelWImage�������panelWest���ϲ࣬���ñ�ǩlabelWImage��textֵ��text�ڱ�ǩ�е�λ��
		 */
		JLabel labelWImage = new JLabel("����·��");
		labelWImage.setHorizontalAlignment(SwingConstants.CENTER);
		panelWest.add(labelWImage, BorderLayout.SOUTH);
		/**
		 * ����JPanel���panelEast�������contentPane�У����������panelEast�Ĳ���
		 */
		JPanel panelEast = new JPanel();
		contentPane.add(panelEast);
		panelEast.setLayout(new BorderLayout(0, 0));
		/**
		 * ������ǩlabelEast�������panelEast���м䣬��Ϊ��ǩ���ͼ��
		 */
		JLabel labelEast = new JLabel("");
		labelEast.setIcon(new ImageIcon(RoadMap.class.getResource("4.png")));
		panelEast.add(labelEast, BorderLayout.CENTER);
		/**
		 * ������ǩlabelEImage�������panelEast���ϲ࣬���ñ�ǩlabelEImage��textֵ��text�ڱ�ǩ�е�λ��
		 */
		JLabel labelEImage = new JLabel("����·��");
		labelEImage.setHorizontalAlignment(SwingConstants.CENTER);
		panelEast.add(labelEImage, BorderLayout.SOUTH);
	}
}

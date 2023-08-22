
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class ZoomFrame extends JFrame {
	private JTextField tf_height;
	private JTextField tf_width;
	private Image img = null; // ����ͼ�����
	private ZoomFramePanel imgPanel; // ����ͼ��������
	private int imgWidth, imgHeight; // ͼƬ�Ŀ�Ⱥ͸߶�
	private int widthScale, heightScale; // ͼƬ�Ŀ�Ⱥ͸߶ȵ����ű���
	private int newWidth, newHeight; // ͼƬ���ź�Ŀ�Ⱥ͸߶�

	public static void main(String args[]) {
		ZoomFrame frame = new ZoomFrame();
		frame.setVisible(true);
	}

	public ZoomFrame() {
		super();
		this.setBounds(100, 100, 355, 275); // ���ô����С��λ��
		this.setTitle("��������Ŀ������ű�����ͼƬ��������"); // ���ô������
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���ô���ر�ģʽ
		try {
			img = ImageIO.read(new File("src/img.jpg"));// ��ȡͼƬ�ļ�
		} catch (IOException e) {
			e.printStackTrace();
		}
		imgPanel = new ZoomFramePanel(); // ����ͼ��������
		getContentPane().add(imgPanel); // �ڴ����в�λ�����ͼ��������
		getContentPane().add(imgPanel, BorderLayout.CENTER); // �ڴ����в�λ�����ͼ��������

		JPanel zoomScalePanel = new JPanel();
		getContentPane().add(zoomScalePanel, BorderLayout.SOUTH);

		JLabel lbl_height = new JLabel("�߶�(H):");
		zoomScalePanel.add(lbl_height);

		tf_height = new JTextField();
		tf_height.setText("100");
		zoomScalePanel.add(tf_height);
		tf_height.setColumns(4);

		JLabel lbl_heightPercent = new JLabel("%");
		zoomScalePanel.add(lbl_heightPercent);

		JLabel lbl_width = new JLabel("���(W):");
		zoomScalePanel.add(lbl_width);

		tf_width = new JTextField();
		tf_width.setText("100");
		zoomScalePanel.add(tf_width);
		tf_width.setColumns(4);

		JLabel lbl_widthPercent = new JLabel("%");
		zoomScalePanel.add(lbl_widthPercent);

		JButton btn_zoom = new JButton("����");
		btn_zoom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				widthScale = Integer.parseInt(tf_width.getText());
				heightScale = Integer.parseInt(tf_height.getText());
				} catch (NumberFormatException nfe) {
					JOptionPane.showMessageDialog(null, "�ı����е��ı����ݲ���Ϊ�ա���", "����", JOptionPane.WARNING_MESSAGE);
					return;
				}
				if (widthScale % 10 != 0 || heightScale % 10 != 0) {
					JOptionPane.showMessageDialog(null, "�ı����������ֵ������10�ı�������", "����", JOptionPane.WARNING_MESSAGE);
					return;
				}
				imgPanel.repaint();// ���µ���������paint()����
			}
		});
		zoomScalePanel.add(btn_zoom);
	}

	// ���������
	class ZoomFramePanel extends JPanel {
		public void paint(Graphics g) {
			g.clearRect(0, 0, this.getWidth(), this.getHeight());// �����ͼ�����ĵ�����
			imgWidth = img.getWidth(this); // ��ȡͼƬ���
			imgHeight = img.getHeight(this); // ��ȡͼƬ�߶�
			widthScale = Integer.parseInt(tf_width.getText());
			heightScale = Integer.parseInt(tf_height.getText());
			newWidth = (int) (imgWidth * widthScale / 100); // ����ͼƬ���ź�Ŀ��
			newHeight = (int) (imgHeight * heightScale / 100); // ����ͼƬ���ź�ĸ߶�
			g.drawImage(img, 0, 0, newWidth, newHeight, this); // ����ָ����С��ͼƬ
		}
	}
}

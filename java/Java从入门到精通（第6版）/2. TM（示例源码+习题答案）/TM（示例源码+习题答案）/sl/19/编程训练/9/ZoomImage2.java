import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ZoomImage2 extends JFrame {
	private int imgWidth, imgHeight;						// ����ͼ��Ŀ�͸�
	private double num;									// ͼƬ�仯����
	private JPanel jPanImg = null;						// ��ʾͼ������
	private JPanel jPanBtn = null;						// ��ʾ���ư�ť�����
	private JButton jBtnBig = null;						// �Ŵ�ť
	private JButton jBtnSmall = null;						// ��С��ť
	private CanvasTest canvas = null;						// ��ͼ���
	public ZoomImage2() {
		initialize();									// ���ó�ʼ������
	}
	private void initialize() {							// �����ʼ������
		this.setBounds(100, 100, 500, 420);				// ���ô����С��λ��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// ���ô���ر�ģʽ
		this.setTitle("ͼ������");							// ���ô������
		jPanImg = new JPanel();							// ���������
		canvas = new CanvasTest();						// ��ȡ����
		jPanImg.setLayout(new BorderLayout());				// ���������
		jPanImg.add(canvas, BorderLayout.CENTER);			// �������ŵ��������
		setContentPane(jPanImg);							// �������������Ϊ��������
		jBtnBig = new JButton("�Ŵ�(+)");					// �Ŵ�ť
		jBtnBig.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				num += 20;						// ����������������ÿ�ε��ͼƬ��߼�20
				canvas.repaint();				// �ػ�Ŵ��ͼ��
			}
		});
		jBtnSmall = new JButton("��С(-)");		// ��С��ť
		jBtnSmall.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				num -= 20;						// ���ø�����������ÿ�ε��ͼƬ��߼�20
				canvas.repaint();				// �ػ���С��ͼ��
			}
		});
		jPanBtn = new JPanel();					// ��ť���
		jPanBtn.setLayout(new FlowLayout());		// ����������
		jPanBtn.add(jBtnBig);						// ��Ӱ�ť
		jPanBtn.add(jBtnSmall);					// ��Ӱ�ť
		jPanImg.add(jPanBtn, BorderLayout.SOUTH);	// �ŵ������ײ�
	}
	public static void main(String[] args) {		// ������
		new ZoomImage2().setVisible(true);			// �������������ʾ����
	}
	class CanvasTest extends Canvas {				// ��������
		public void paint(Graphics g) {			// ��дpaint�����������ػ�ͼ��
			Image img = null;
			
			try {
				img = ImageIO.read(new File("src/img.jpg"));// ��ȡͼƬ�ļ�
			} catch (IOException e) {
				e.printStackTrace();
			}
			imgWidth = img.getWidth(this);		// ��ȡͼ����
			imgHeight = img.getHeight(this);		// ��ȡͼ��߶�
			int newW = (int) (imgWidth + num);	// ����ͼ��Ŵ��Ŀ��
			int newH = (int) (imgHeight + num);	// ����ͼ��Ŵ��ĸ߶�
			g.drawImage(img, 0, 0, newW, newH, this); 				// ����ָ����С��ͼ��
		}
	}
}

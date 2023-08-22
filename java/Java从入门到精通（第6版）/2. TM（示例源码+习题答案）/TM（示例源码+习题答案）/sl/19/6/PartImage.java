
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.imageio.ImageIO;

public class PartImage extends JFrame {
	private Image img;
	private int dx1, dy1, dx2, dy2;
	private int sx1, sy1, sx2, sy2;
	private int width = 300, height = 200;// ͼƬ���
	private JButton vBtn = null;// ��ֱ��ת��ť
	private JButton hBtn = null;// ˮƽ��ת��ť
	private CanvasPanel canvasPanel = null;

	public PartImage() {

		try {
			img = ImageIO.read(new File("src/cow.jpg"));// ��ȡͼƬ�ļ�
		} catch (IOException e) {
			e.printStackTrace();
		}
		dx2 = sx2 = width; // ��ʼ��ͼ���С
		dy2 = sy2 = height;

		vBtn = new JButton("��ֱ��ת");
		hBtn = new JButton("ˮƽ��ת");

		JPanel bottom = new JPanel();
		bottom.add(hBtn);
		bottom.add(vBtn);

		Container c = getContentPane();
		c.add(bottom, BorderLayout.SOUTH);
		canvasPanel = new CanvasPanel();
		c.add(canvasPanel, BorderLayout.CENTER);

		addListener();

		setBounds(100, 100, 300, 260); // ���ô����С��λ��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���ô���ر�ģʽ
		setTitle("ͼƬ��ת"); // ���ô������
	}

	private void addListener() {
		vBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sy1 = Math.abs(sy1 - height);// �����껥��
				sy2 = Math.abs(sy2 - height);
				canvasPanel.repaint();
			}
		});
		hBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sx1 = Math.abs(sx1 - width);// �����껥��
				sx2 = Math.abs(sx2 - width);
				canvasPanel.repaint();
			}
		});
	}

	class CanvasPanel extends JPanel {
		public void paint(Graphics g) {
			g.drawImage(img, dx1, dy1, dx2, dy2, sx1, sy1, sx2, sy2, this);// ����ָ����С��ͼƬ
		}
	}

	public static void main(String[] args) {
		new PartImage().setVisible(true);
	}
}
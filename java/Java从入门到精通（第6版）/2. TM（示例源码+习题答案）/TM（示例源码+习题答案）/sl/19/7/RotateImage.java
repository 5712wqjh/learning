
import java.awt.*;
import java.io.*;
import javax.swing.*;
import javax.imageio.ImageIO;

public class RotateImage extends JFrame {
	private Image img;

	public RotateImage() {
		try {
			img = ImageIO.read(new File("src/cow.jpg"));// ��ȡͼƬ�ļ�
		} catch (IOException e) {
			e.printStackTrace();
		}
		setBounds(100, 100, 400, 350); // ���ô����С��λ��
		add(new CanvasPanel());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���ô���ر�ģʽ
		setTitle("ͼƬ��ת"); // ���ô������
	}

	class CanvasPanel extends JPanel { // ����
		public void paint(Graphics g) {
			Graphics2D g2 = (Graphics2D) g;
			g2.rotate(Math.toRadians(5));// ��ת5��
			g2.drawImage(img, 70, 10, 300, 200, this);
			g2.rotate(Math.toRadians(5));
			g2.drawImage(img, 70, 10, 300, 200, this);
			g2.rotate(Math.toRadians(5));
			g2.drawImage(img, 70, 10, 300, 200, this);
		}
	}

	public static void main(String[] args) { // ������
		new RotateImage().setVisible(true);
	}
}

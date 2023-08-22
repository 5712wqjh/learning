import java.awt.*;
import java.io.*;
import javax.swing.*;
import javax.imageio.ImageIO;

public class TiltImage extends JFrame {
	private Image img;

	public TiltImage() {
		try {
			img = ImageIO.read(new File("src/cow.jpg"));// ��ȡͼƬ�ļ�
		} catch (IOException e) {
			e.printStackTrace();
		}
		setBounds(100, 100, 400, 300); // ���ô����С��λ��
		add(new CanvasPanel());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���ô���ر�ģʽ
		setTitle("ͼƬ��б"); // ���ô������
	}

	class CanvasPanel extends JPanel {
		public void paint(Graphics g) {
			Graphics2D g2 = (Graphics2D) g;
			g2.shear(0.3, 0);// ��б30%
			g2.drawImage(img, 0, 0, 300, 200, this);
		}
	}

	public static void main(String[] args) {
		new TiltImage().setVisible(true);
	}
}

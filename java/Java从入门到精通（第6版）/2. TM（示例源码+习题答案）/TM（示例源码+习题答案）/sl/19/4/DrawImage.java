
import java.awt.*;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;

public class DrawImage extends JFrame {
	Image img;// չʾ��ͼƬ

	public DrawImage() {
		try {
			img = ImageIO.read(new File("src/img.jpg"));// ��ȡͼƬ�ļ�
		} catch (IOException e) {
			e.printStackTrace();
		}
		setSize(440, 300); // ���ô����С
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���ô���ر�ģʽ
		add(new CanvasPanel()); // ���ô������Ϊ��ͼ������
		setTitle("����ͼƬ"); // ���ô������
	}

	class CanvasPanel extends JPanel {
		public void paint(Graphics g) {
			Graphics2D g2 = (Graphics2D) g;
			g2.drawImage(img, 0, 0, this); // ��ʾͼƬ
		}
	}

	public static void main(String[] args) {
		new DrawImage().setVisible(true);
	}
}


import java.awt.*;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;

public class DrawImage2 extends JFrame {
	Image img1,img2;// չʾ��ͼƬ

	public DrawImage2() {
		try {
			img1 = ImageIO.read(new File("src/img.jpg"));// ��ȡͼƬ�ļ�
			img2 = ImageIO.read(new File("src/cow.jpg"));// ��ȡͼƬ�ļ�
		} catch (IOException e) {
			e.printStackTrace();
		}
		setSize(800, 300); // ���ô����С
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���ô���ر�ģʽ
		add(new CanvasPanel()); // ���ô������Ϊ��ͼ������
		setTitle("����ͼƬ"); // ���ô������
	}

	class CanvasPanel extends JPanel {
		public void paint(Graphics g) {
			Graphics2D g2 = (Graphics2D) g;
			g2.drawImage(img1, 0, 0, this); // ��ʾͼƬ
			g2.drawImage(img2, 450, 0, this); // ��ʾͼƬ
		}
	}

	public static void main(String[] args) {
		new DrawImage2().setVisible(true);
	}
}

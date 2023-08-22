
import java.awt.*;
import java.io.*;
import javax.swing.*;
import javax.imageio.ImageIO;

public class RotateImage extends JFrame {
	private Image img;

	public RotateImage() {
		try {
			img = ImageIO.read(new File("src/cow.jpg"));// 读取图片文件
		} catch (IOException e) {
			e.printStackTrace();
		}
		setBounds(100, 100, 400, 350); // 设置窗体大小和位置
		add(new CanvasPanel());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置窗体关闭模式
		setTitle("图片旋转"); // 设置窗体标题
	}

	class CanvasPanel extends JPanel { // 画板
		public void paint(Graphics g) {
			Graphics2D g2 = (Graphics2D) g;
			g2.rotate(Math.toRadians(5));// 旋转5度
			g2.drawImage(img, 70, 10, 300, 200, this);
			g2.rotate(Math.toRadians(5));
			g2.drawImage(img, 70, 10, 300, 200, this);
			g2.rotate(Math.toRadians(5));
			g2.drawImage(img, 70, 10, 300, 200, this);
		}
	}

	public static void main(String[] args) { // 主方法
		new RotateImage().setVisible(true);
	}
}

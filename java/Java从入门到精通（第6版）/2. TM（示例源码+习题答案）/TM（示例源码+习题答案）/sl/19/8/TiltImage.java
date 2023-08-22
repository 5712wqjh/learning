import java.awt.*;
import java.io.*;
import javax.swing.*;
import javax.imageio.ImageIO;

public class TiltImage extends JFrame {
	private Image img;

	public TiltImage() {
		try {
			img = ImageIO.read(new File("src/cow.jpg"));// 读取图片文件
		} catch (IOException e) {
			e.printStackTrace();
		}
		setBounds(100, 100, 400, 300); // 设置窗体大小和位置
		add(new CanvasPanel());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置窗体关闭模式
		setTitle("图片倾斜"); // 设置窗体标题
	}

	class CanvasPanel extends JPanel {
		public void paint(Graphics g) {
			Graphics2D g2 = (Graphics2D) g;
			g2.shear(0.3, 0);// 倾斜30%
			g2.drawImage(img, 0, 0, 300, 200, this);
		}
	}

	public static void main(String[] args) {
		new TiltImage().setVisible(true);
	}
}

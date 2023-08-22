
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.imageio.ImageIO;

public class PartImage extends JFrame {
	private Image img;
	private int dx1, dy1, dx2, dy2;
	private int sx1, sy1, sx2, sy2;
	private int width = 300, height = 200;// 图片宽高
	private JButton vBtn = null;// 垂直翻转按钮
	private JButton hBtn = null;// 水平翻转按钮
	private CanvasPanel canvasPanel = null;

	public PartImage() {

		try {
			img = ImageIO.read(new File("src/cow.jpg"));// 读取图片文件
		} catch (IOException e) {
			e.printStackTrace();
		}
		dx2 = sx2 = width; // 初始化图像大小
		dy2 = sy2 = height;

		vBtn = new JButton("垂直翻转");
		hBtn = new JButton("水平翻转");

		JPanel bottom = new JPanel();
		bottom.add(hBtn);
		bottom.add(vBtn);

		Container c = getContentPane();
		c.add(bottom, BorderLayout.SOUTH);
		canvasPanel = new CanvasPanel();
		c.add(canvasPanel, BorderLayout.CENTER);

		addListener();

		setBounds(100, 100, 300, 260); // 设置窗体大小和位置
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置窗体关闭模式
		setTitle("图片翻转"); // 设置窗体标题
	}

	private void addListener() {
		vBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sy1 = Math.abs(sy1 - height);// 纵坐标互换
				sy2 = Math.abs(sy2 - height);
				canvasPanel.repaint();
			}
		});
		hBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sx1 = Math.abs(sx1 - width);// 横坐标互换
				sx2 = Math.abs(sx2 - width);
				canvasPanel.repaint();
			}
		});
	}

	class CanvasPanel extends JPanel {
		public void paint(Graphics g) {
			g.drawImage(img, dx1, dy1, dx2, dy2, sx1, sy1, sx2, sy2, this);// 绘制指定大小的图片
		}
	}

	public static void main(String[] args) {
		new PartImage().setVisible(true);
	}
}
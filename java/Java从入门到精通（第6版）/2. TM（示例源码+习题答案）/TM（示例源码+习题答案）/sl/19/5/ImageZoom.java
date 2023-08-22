import java.awt.*;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.*;

public class ImageZoom extends JFrame {
	Image img;
	private int imgWidth, imgHeight;
	private JSlider jSlider;

	public ImageZoom() {
		try {
			img = ImageIO.read(new File("src/img.jpg"));// 读取图片文件
		} catch (IOException e) {
			e.printStackTrace();
		}

		CanvasPanel canvas = new CanvasPanel();
		jSlider = new JSlider();
		jSlider.setMaximum(1000);
		jSlider.setValue(100);
		jSlider.setMinimum(1);
		jSlider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				canvas.repaint();
			}
		});

		JPanel center = new JPanel();
		center.setLayout(new BorderLayout());
		center.add(jSlider, BorderLayout.SOUTH);
		center.add(canvas, BorderLayout.CENTER);
		setContentPane(center);
		setBounds(100, 100, 800, 600); // 设置窗体大小和位置
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置窗体关闭模式
		setTitle("绘制图片");
	}

	class CanvasPanel extends JPanel {
		public void paint(Graphics g) {
			int newW = 0, newH = 0;
			imgWidth = img.getWidth(this); // 获取图片宽度
			imgHeight = img.getHeight(this); // 获取图片高度
			float value = jSlider.getValue();// 滑块组件的取值
			newW = (int) (imgWidth * value / 100);// 计算图片放大后的宽度
			newH = (int) (imgHeight * value / 100);// 计算图片放大后的高度
			g.drawImage(img, 0, 0, newW, newH, this);// 绘制指定大小的图片
		}
	}

	public static void main(String[] args) {
		new ImageZoom().setVisible(true);
	}
}
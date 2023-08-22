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
			img = ImageIO.read(new File("src/img.jpg"));// ��ȡͼƬ�ļ�
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
		setBounds(100, 100, 800, 600); // ���ô����С��λ��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���ô���ر�ģʽ
		setTitle("����ͼƬ");
	}

	class CanvasPanel extends JPanel {
		public void paint(Graphics g) {
			int newW = 0, newH = 0;
			imgWidth = img.getWidth(this); // ��ȡͼƬ���
			imgHeight = img.getHeight(this); // ��ȡͼƬ�߶�
			float value = jSlider.getValue();// ���������ȡֵ
			newW = (int) (imgWidth * value / 100);// ����ͼƬ�Ŵ��Ŀ��
			newH = (int) (imgHeight * value / 100);// ����ͼƬ�Ŵ��ĸ߶�
			g.drawImage(img, 0, 0, newW, newH, this);// ����ָ����С��ͼƬ
		}
	}

	public static void main(String[] args) {
		new ImageZoom().setVisible(true);
	}
}
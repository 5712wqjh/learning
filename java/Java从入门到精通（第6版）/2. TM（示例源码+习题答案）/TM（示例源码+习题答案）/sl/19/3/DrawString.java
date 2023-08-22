import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.util.Date;
import javax.swing.*;

public class DrawString extends JFrame {

	public DrawString() {
		setSize(230, 140); // 设置窗体大小
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置窗体关闭模式
		add(new CanvasPanel()); // 设置窗体面板为绘图面板对象
		setTitle("绘图文本"); // 设置窗体标题
	}

	class CanvasPanel extends JPanel {
		public void paint(Graphics g) {
			Graphics2D g2 = (Graphics2D) g;
			Rectangle2D rect = new Rectangle2D.Double(10, 10, 200, 80);
			Font font = new Font("宋体", Font.BOLD, 16);
			Date date = new Date();
			g2.setColor(Color.CYAN); // 设置当前绘图颜色
			g2.fill(rect); // 填充矩形
			g2.setColor(Color.BLUE); // 设置当前绘图颜色
			g2.setFont(font); // 设置字体
			g2.drawString("现在时间是", 20, 30); // 绘制文本
			g2.drawString(String.format("%tr", date), 50, 60); // 绘制时间文本
		}
	}

	public static void main(String[] args) {
		new DrawString().setVisible(true);
	}
}

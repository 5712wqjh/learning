
import java.awt.*;
import java.util.Random;
import javax.swing.*;

public class SleepMethodTest extends JFrame {
	private static Color[] color = { Color.BLACK, Color.BLUE, Color.CYAN, Color.GREEN, Color.ORANGE, Color.YELLOW,
			Color.RED, Color.PINK, Color.LIGHT_GRAY }; // 定义颜色数组
	private static final Random rand = new Random(); // 创建随机对象

	private static Color getC() { // 获取随机颜色值的方法
		return color[rand.nextInt(color.length)];
	}

	public SleepMethodTest() {
		Thread t = new Thread(new Runnable() { // 创建匿名线程对象
			int x = 30; // 定义初始坐标
			int y = 50;

			public void run() { 
				while (true) { // 无限循环
					try {
						Thread.sleep(100); // 线程休眠0.1秒
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					Graphics graphics = getGraphics(); // 获取组件绘图上下文对象
					graphics.setColor(getC()); // 设置绘图颜色
					graphics.drawLine(x, y, 100, y++); // 绘制直线并递增垂直坐标
					if (y >= 80) {
						y = 50;
					}
				}
			}
		});
		t.start(); // 启动线程
	}

	public static void main(String[] args) {
		init(new SleepMethodTest(), 100, 100);
	}

	public static void init(JFrame frame, int width, int height) { // 初始化程序界面的方法
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(width, height);
		frame.setVisible(true);
	}
}

import java.awt.Container;
import javax.swing.*;

public class SwingAndThread extends JFrame {
	int count = 0; // 图标横坐标

	public SwingAndThread() {
		setBounds(300, 200, 250, 100); // 绝对定位窗体大小与位置
		Container container = getContentPane();// 主容器
		container.setLayout(null); // 使窗体不使用任何布局管理器

		Icon icon = new ImageIcon("src/1.gif"); // 图标对象
		JLabel jl = new JLabel(icon);// 显示图标的标签
		jl.setBounds(10, 10, 200, 50); // 设置标签的位置与大小
		Thread t = new Thread() { // 定义匿名线程对象
			public void run() {
				while (true) {
					jl.setBounds(count, 10, 200, 50); // 将标签的横坐标用变量表示
					try {
						Thread.sleep(500); // 使线程休眠500毫秒
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					count += 4; // 使横坐标每次增加4
					if (count >= 200) {
						// 当图标到达标签的最右边时，使其回到标签最左边
						count = 10;
					}
				}
			}
		};
		t.start(); // 启动线程
		container.add(jl); // 将标签添加到容器中
		setVisible(true); // 使窗体可见
		// 设置窗体的关闭方式
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new SwingAndThread(); // 实例化一个SwingAndThread对象
	}
}

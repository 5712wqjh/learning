
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class JLabelTest extends JFrame {
	public JLabelTest() {
		Container container = getContentPane();
		// 创建一个标签
		JLabel jl = new JLabel("这是一个JFrame窗体");
		container.add(jl); // 将标签添加到容器中
		setSize(200, 100); // 设置窗体大小
		// 设置窗体关闭模式
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true); // 使窗体可见
	}

	public static void main(String args[]) {
		new JLabelTest(); // 创建MyImageIcon对象
	}
}

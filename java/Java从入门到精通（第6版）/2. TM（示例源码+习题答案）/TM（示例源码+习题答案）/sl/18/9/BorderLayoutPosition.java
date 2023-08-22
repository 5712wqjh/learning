import java.awt.*;
import javax.swing.*;

public class BorderLayoutPosition extends JFrame {
	public BorderLayoutPosition() {
		setTitle("这个窗体使用边界布局管理器");
		Container c = getContentPane(); // 获取主容器
		setLayout(new BorderLayout()); // 容器使用边界布局
		JButton centerBtn = new JButton("中");
		JButton northBtn = new JButton("北");
		JButton southBtn = new JButton("南");
		JButton westBtn = new JButton("西");
		JButton eastBtn = new JButton("东");
		c.add(centerBtn, BorderLayout.CENTER); // 中部添加按钮
		c.add(northBtn, BorderLayout.NORTH); // 北部添加按钮
		c.add(southBtn, BorderLayout.SOUTH); // 南部添加按钮
		c.add(westBtn, BorderLayout.WEST); // 西部添加按钮
		c.add(eastBtn, BorderLayout.EAST); // 东部添加按钮
		setSize(350, 200); // 设置窗体大小
		setVisible(true); // 设置窗体可见
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE); // 关闭窗体则停止程序
	}

	public static void main(String[] args) {
		new BorderLayoutPosition();
	}
}

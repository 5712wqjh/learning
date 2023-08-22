import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyJDialog extends JDialog { // 自定义对话框类，继承JDialog
	public MyJDialog(MyFrame frame) {
		// 调用父类构造方法，第一个参数是父窗体，第二个参数是窗体标题，第三个参数表示阻塞父窗体
		super(frame, "第一个JDialog窗体", true);
		Container container = getContentPane(); // 获取主容器
		container.add(new JLabel("这是一个对话框")); // 在容器中添加标签
		setBounds(120, 120, 100, 100); // 设置对话框窗体在桌面显示的坐标和大小
	}
}

public class MyFrame extends JFrame { // 自定义窗体类，继承JFrame
	public MyFrame() {// 窗体的构造方法
		Container container = getContentPane(); // 获得窗体主容器
		container.setLayout(null); // 容器使用绝对布局
		JButton bl = new JButton("弹出对话框"); // 创建一个按钮
		bl.setBounds(10, 10, 100, 21); // 定义按钮在容器中的坐标和大小
		bl.addActionListener(new ActionListener() { // 为按钮添加点击事件
			public void actionPerformed(ActionEvent e) {// 点击事件触发的方法
				MyJDialog dialog = new MyJDialog(MyFrame.this); // 创建MyJDialo对话框
				dialog.setVisible(true); // 使对话框可见
			}
		});
		container.add(bl); // 将按钮添加到容器中
		setSize(200, 200); // 窗体的宽高
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // 关闭窗体则停止程序
		setVisible(true); // 使窗体可见
	}

	public static void main(String args[]) {
		new MyFrame();
	}
}

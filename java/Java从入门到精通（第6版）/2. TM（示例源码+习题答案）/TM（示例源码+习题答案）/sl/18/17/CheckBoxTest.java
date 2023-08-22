
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxTest extends JFrame {
	public CheckBoxTest() {
		setBounds(100, 100, 170, 110); // 窗口坐标和大小
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane(); // 获取主容器
		c.setLayout(new FlowLayout()); // 容器使用流布局
		JCheckBox c1 = new JCheckBox("1"); // 创建复选框
		JCheckBox c2 = new JCheckBox("2");
		JCheckBox c3 = new JCheckBox("3");
		c.add(c1); // 容器添加复选框
		c.add(c2);
		c.add(c3);
		JButton btn = new JButton("打印"); // 创建打印按钮
		btn.addActionListener(new ActionListener() { // 打印按钮动作事件
			public void actionPerformed(ActionEvent e) {
				// 在控制台分别输出三个复选框的选中状态
				System.out.println(c1.getText() + "按钮选中状态：" + c1.isSelected());
				System.out.println(c2.getText() + "按钮选中状态：" + c2.isSelected());
				System.out.println(c3.getText() + "按钮选中状态：" + c3.isSelected());
			}
		});
		c.add(btn); // 容器添加打印按钮
		setVisible(true);
	}

	public static void main(String[] args) {
		new CheckBoxTest();
	}
}

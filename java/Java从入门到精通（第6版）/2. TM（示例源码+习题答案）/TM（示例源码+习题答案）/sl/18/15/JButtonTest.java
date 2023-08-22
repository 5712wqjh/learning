import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JButtonTest extends JFrame {
	public JButtonTest() {
		Icon icon = new ImageIcon("src/imageButtoo.jpg"); // 获取图片文件
		setLayout(new GridLayout(3, 2, 5, 5)); // 设置网格布局管理器
		Container c = getContentPane(); // 获取主容器
		JButton btn[] = new JButton[6]; // 创建按钮数组
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(); // 实例化数组中的对象
			c.add(btn[i]); // 将按钮添加到容器中
		}
		btn[0].setText("不可用");
		btn[0].setEnabled(false); // 设置按钮不可用
		btn[1].setText("有背景色");
		btn[1].setBackground(Color.YELLOW);
		btn[2].setText("无边框");
		btn[2].setBorderPainted(false); // 设置按钮边框不显示
		btn[3].setText("有边框");
		btn[3].setBorder(BorderFactory.createLineBorder(Color.RED)); // 添加红色线型边框
		btn[4].setIcon(icon); // 为按钮设置图标
		btn[4].setToolTipText("图片按钮"); // 设置鼠标悬停时提示的文字
		btn[5].setText("可点击");
		btn[5].addActionListener(new ActionListener() { // 为按钮添加监听事件
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(JButtonTest.this, "点击按钮"); // 弹出确认对话框
			}
		});
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setTitle("创建不同样式的按钮");
		setBounds(100, 100, 400, 200);
	}

	public static void main(String[] args) {
		new JButtonTest();
	}
}

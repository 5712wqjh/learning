import java.awt.Container;
import java.awt.event.*;
import javax.swing.*;

public class JListTest extends JFrame {
	public JListTest() {
		Container cp = getContentPane(); // 获取窗体主容器
		cp.setLayout(null); // 容器使用绝对布局
		// 创建字符串数组，保存列表的中的数据
		String[] contents = { "列表1", "列表2", "列表3", "列表4", "列表5", "列表6" };
		JList<String> jl = new JList<>(contents); // 创建列表，并将数据作为构造参数
		JScrollPane js = new JScrollPane(jl); // 将列表放入滚动面板
		js.setBounds(10, 10, 100, 109); // 设定滚动面板的坐标和大小
		cp.add(js);
		JTextArea area = new JTextArea(); // 创建文本域
		JScrollPane scrollPane = new JScrollPane(area); // 将文本域放入滚动面板
		scrollPane.setBounds(118, 10, 73, 80); // 设定滚动面板的坐标和大小
		cp.add(scrollPane);
		JButton btnNewButton = new JButton("确认"); // 创建确认按钮
		btnNewButton.setBounds(120, 96, 71, 23); // 设定按钮的坐标和大小
		cp.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() { // 添加按钮事件
			public void actionPerformed(ActionEvent e) {
				// 获取列表中选中的元素，返回java.util.List类型
				java.util.List<String> values = jl.getSelectedValuesList();
				area.setText(""); // 清空文本域
				for (String value : values) {
					area.append(value + "\n"); // 在文本域循环追加List中的元素值
				}
			}
		});
		setTitle("在这个窗体中使用了列表框");
		setSize(217, 167);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {
		new JListTest();
	}
}

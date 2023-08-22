

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class JScrollPaneTest extends JFrame {
	public JScrollPaneTest() {
		Container c = getContentPane(); // 获取主容器
		// 创建文本区域组件,文本域默认大小为20行、50列
		JTextArea ta = new JTextArea(20, 50);
		// 创建JScrollPane滚动面板，并将文本域放到滚动面板中
		JScrollPane sp = new JScrollPane(ta);
		c.add(sp); // 将该面板添加到主容器中
		setTitle("带滚动条的文字编译器");
		setSize(400, 200);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}

	public static void main(String[] args) {
		JScrollPaneTest test = new JScrollPaneTest();
		test.setVisible(true);
	}
}

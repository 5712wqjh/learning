
import java.awt.Container;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class MyImageIcon extends JFrame {
	public MyImageIcon() {
		Container container = getContentPane();
		//创建一个标签
		JLabel jl = new JLabel("这是一个JFrame窗体", JLabel.CENTER);
		//获取图片所在的URL
		URL url = MyImageIcon.class.getResource("pic.png");
		Icon icon = new ImageIcon(url); 		//创建Icon对象
		jl.setIcon(icon); 						//为标签设置图片
		//设置文字放置在标签中间
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		jl.setOpaque(true); 					//设置标签为不透明状态
		container.add(jl); 						//将标签添加到容器中
		setSize(300, 200); 						//设置窗体大小
		setVisible(true); 						//使窗体可见
		//设置窗体关闭模式
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	public static void main(String args[]) {
		new MyImageIcon(); 						//创建MyImageIcon对象
	}
}

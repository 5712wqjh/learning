
import java.awt.*; //导入AWT包
import javax.swing.*; //导入Swing包

public class JFreamDemo {
	public static void main(String args[]) { // 主方法
		JFrame jf = new JFrame();// 创建窗体对象
		jf.setTitle("创建一个JFrame窗体");// 设置窗体标题
		Container container = jf.getContentPane(); // 获取主容器
		JLabel jl = new JLabel("这是一个JFrame窗体");// 一个文本标签
		jl.setHorizontalAlignment(SwingConstants.CENTER); // 使标签上的文字居中
		container.add(jl); // 将标签添加到主容器中
		jf.setSize(300, 150); // 设置窗体宽高
		jf.setLocation(320, 240);// 设置窗体在屏幕中出现的位置
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // 关闭窗体则停止程序
		jf.setVisible(true); // 让窗体展示出来
	}
}

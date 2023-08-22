import java.awt.*;
import javax.swing.*;
public class FlowLayoutPosition extends JFrame {
    public FlowLayoutPosition() {
        setTitle("本窗体使用流布局管理器");       // 设置窗体标题
        Container c = getContentPane();
        // 窗体使用流布局，组件右对齐，组件之间的水平间隔为10像素，垂直间隔10像素
        setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 10));
        for (int i = 0; i < 10; i++) {        // 在容器中循环添加10个按钮
            c.add(new JButton("button" + i));
        }
        setSize(300, 200);                    // 设置窗体大小
       
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE); // 关闭窗体则停止程序
        setVisible(true);                    // 设置窗体可见
    }
    public static void main(String[] args) {
        new FlowLayoutPosition();
    }
}

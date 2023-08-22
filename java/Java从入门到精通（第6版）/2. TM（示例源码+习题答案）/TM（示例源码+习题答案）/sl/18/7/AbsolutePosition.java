
import java.awt.*;
import javax.swing.*;
public class AbsolutePosition extends JFrame {
    public AbsolutePosition() {
        setTitle("本窗体使用绝对布局");               // 窗体标题
        setLayout(null);                              // 使用null布局
        setBounds(0, 0, 300, 150);                  // 设置窗体的坐标与宽高
        Container c = getContentPane();            // 获取主容器
        JButton b1 = new JButton("按钮1");          // 创建按钮
        JButton b2 = new JButton("按钮2"); 
        b1.setBounds(10, 30, 80, 30);               // 设置按钮的位置与大小
        b2.setBounds(60, 70, 100, 20);
        c.add(b1); // 将按钮添加到容器中
        c.add(b2);
        setVisible(true);                               // 使窗体可见
      
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);   // 关闭窗体则停止程序
    }
    public static void main(String[] args) {
        new AbsolutePosition();
    }
}

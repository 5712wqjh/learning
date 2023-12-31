import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JTextFieldTest extends JFrame {
    public JTextFieldTest() {
        Container c = getContentPane();                        // 获取窗体主容器
        c.setLayout(new FlowLayout());
        JTextField jt = new JTextField("请点击清除按钮");      // 设定文本框初始值
        jt.setColumns(20);                                       // 设置文本框长度
        jt.setFont(new Font("宋体", Font.PLAIN, 20));          // 设置字体
        JButton jb = new JButton("清除");
        jt.addActionListener(new ActionListener() {            // 为文本框添加回车事件
            public void actionPerformed(ActionEvent arg0) {
                jt.setText("触发事件");                            // 设置文本框中的值
            }
        });
        jb.addActionListener(new ActionListener() {           // 为按钮添加事件
            public void actionPerformed(ActionEvent arg0) {
                System.out.println(jt.getText());             // 输出当前文本框的值
                jt.setText("");                                // 将文本框置空
                jt.requestFocus();                            // 焦点回到文本框
            }
        });
        c.add(jt);                                              // 窗体容器添加文本框
        c.add(jb);                                               // 窗体添加按钮
        setBounds(100, 100, 250, 110);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new JTextFieldTest();
    }
}

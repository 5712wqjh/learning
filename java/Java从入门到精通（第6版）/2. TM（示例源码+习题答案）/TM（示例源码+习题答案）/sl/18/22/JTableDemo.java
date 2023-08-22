import java.awt.*;
import javax.swing.*;
public class JTableDemo extends JFrame {
    public static void main(String args[]) {
        JTableDemo frame = new JTableDemo();
        frame.setVisible(true);
    }
    public JTableDemo() {
        setTitle("创建可以滚动的表格");
        setBounds(100, 100, 240, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String[] columnNames = {"A", "B"};                  // 定义表格列名数组
        // 定义表格数据数组
        String[][] tableValues = {{"A1", "B1"}, {"A2", "B2"}, {"A3", "B3"},
                {"A4", "B4"}, {"A5", "B5"}};
        // 创建指定列名和数据的表格
        JTable table = new JTable(tableValues, columnNames);
        // 创建显示表格的滚动面板
        JScrollPane scrollPane = new JScrollPane(table);
        // 将滚动面板添加到边界布局的中间
        getContentPane().add(scrollPane, BorderLayout.CENTER);
    }
}

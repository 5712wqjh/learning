import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
public class AddAndDeleteDemo extends JFrame {
    private DefaultTableModel tableModel;          // 定义表格模型对象
    private JTable table;                            // 定义表格对象
    private JTextField aTextField;
    private JTextField bTextField;
    public static void main(String args[]) {
        AddAndDeleteDemo frame = new AddAndDeleteDemo();
        frame.setVisible(true);
    }
    public AddAndDeleteDemo() {
        setTitle("维护表格模型");
        setBounds(100, 100, 530, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final JScrollPane scrollPane = new JScrollPane();
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        String[] columnNames = {"A", "B"};          // 定义表格列名数组
         // 定义表格数据数组
        String[][] tableValues = {{"A1", "B1"}, {"A2", "B2"}, {"A3", "B3"}}; 
        // 创建指定表格列名和表格数据的表格模型
        tableModel = new DefaultTableModel(tableValues, columnNames);
        table = new JTable(tableModel);                // 创建指定表格模型的表格
        table.setRowSorter(new TableRowSorter<>(tableModel));     // 设置表格的排序器
        // 设置表格的选择模式为单选
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        // 为表格添加鼠标事件监听器
        table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {         // 发生了单击事件
                int selectedRow = table.getSelectedRow();    // 获得被选中行的索引
                // 从表格模型中获得指定单元格的值
                Object oa = tableModel.getValueAt(selectedRow, 0);
                // 从表格模型中获得指定单元格的值
                Object ob = tableModel.getValueAt(selectedRow, 1);
                aTextField.setText(oa.toString());           // 将值赋值给文本框
                bTextField.setText(ob.toString());           // 将值赋值给文本框
            }
        });
        scrollPane.setViewportView(table);
        JPanel panel = new JPanel();
        getContentPane().add(panel, BorderLayout.SOUTH);
        panel.add(new JLabel("A："));
        aTextField = new JTextField("A4", 10);
        panel.add(aTextField);
        panel.add(new JLabel("B："));
        bTextField = new JTextField("B4", 10);
        panel.add(bTextField);
        JButton addButton = new JButton("添加");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String[] rowValues = {aTextField.getText(),
                        bTextField.getText()};              // 创建表格行数组
                tableModel.addRow(rowValues);              // 向表格模型中添加一行
                int rowCount = table.getRowCount() + 1;
                aTextField.setText("A" + rowCount);
                bTextField.setText("B" + rowCount);
            }
        });
        panel.add(addButton);
        JButton updButton = new JButton("修改");
        updButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();  // 获得被选中行的索引
                if (selectedRow != -1) {                     // 判断是否存在被选中行
                    // 修改表格模型当中的指定值
                    tableModel.setValueAt(aTextField.getText(), selectedRow, 0); 
                    // 修改表格模型当中的指定值
                    tableModel.setValueAt(bTextField.getText(), selectedRow, 1); 
                }
            }
        });
        panel.add(updButton);
        JButton delButton = new JButton("删除");
        delButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();  // 获得被选中行的索引
                if (selectedRow != -1)                        // 判断是否存在被选中行
                    tableModel.removeRow(selectedRow);       // 从表格模型当中删除指定行
            } 
        });
        panel.add(delButton);
    }
}

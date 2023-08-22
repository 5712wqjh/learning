import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
public class SortingTable extends JFrame {
    private static final long serialVersionUID = 1L;
    public static void main(String args[]) {
        SortingTable frame = new SortingTable();
        frame.setVisible(true);
    }
    public SortingTable() {
        setTitle("���ģ������");
        setBounds(100, 100, 240, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JScrollPane scrollPane = new JScrollPane();
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        String[] columnNames = {"A", "B"};               // ��������������
        // ��������������
        String[][] tableValues = {{"A1", "B1"}, {"A2", "B2"}, {"A3", "B3"}}; 
        // ����ָ����������ͱ�����ݵı��ģ��
        DefaultTableModel tableModel = new DefaultTableModel(tableValues, columnNames);  
        JTable table = new JTable(tableModel);         // ����ָ�����ģ�͵ı��
        table.setRowSorter(new TableRowSorter<>(tableModel));
        scrollPane.setViewportView(table);
    }
}

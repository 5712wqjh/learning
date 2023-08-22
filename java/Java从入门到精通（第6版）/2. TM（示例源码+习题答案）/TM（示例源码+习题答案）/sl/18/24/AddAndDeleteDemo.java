import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
public class AddAndDeleteDemo extends JFrame {
    private DefaultTableModel tableModel;          // ������ģ�Ͷ���
    private JTable table;                            // ���������
    private JTextField aTextField;
    private JTextField bTextField;
    public static void main(String args[]) {
        AddAndDeleteDemo frame = new AddAndDeleteDemo();
        frame.setVisible(true);
    }
    public AddAndDeleteDemo() {
        setTitle("ά�����ģ��");
        setBounds(100, 100, 530, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final JScrollPane scrollPane = new JScrollPane();
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        String[] columnNames = {"A", "B"};          // ��������������
         // ��������������
        String[][] tableValues = {{"A1", "B1"}, {"A2", "B2"}, {"A3", "B3"}}; 
        // ����ָ����������ͱ�����ݵı��ģ��
        tableModel = new DefaultTableModel(tableValues, columnNames);
        table = new JTable(tableModel);                // ����ָ�����ģ�͵ı��
        table.setRowSorter(new TableRowSorter<>(tableModel));     // ���ñ���������
        // ���ñ���ѡ��ģʽΪ��ѡ
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        // Ϊ����������¼�������
        table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {         // �����˵����¼�
                int selectedRow = table.getSelectedRow();    // ��ñ�ѡ���е�����
                // �ӱ��ģ���л��ָ����Ԫ���ֵ
                Object oa = tableModel.getValueAt(selectedRow, 0);
                // �ӱ��ģ���л��ָ����Ԫ���ֵ
                Object ob = tableModel.getValueAt(selectedRow, 1);
                aTextField.setText(oa.toString());           // ��ֵ��ֵ���ı���
                bTextField.setText(ob.toString());           // ��ֵ��ֵ���ı���
            }
        });
        scrollPane.setViewportView(table);
        JPanel panel = new JPanel();
        getContentPane().add(panel, BorderLayout.SOUTH);
        panel.add(new JLabel("A��"));
        aTextField = new JTextField("A4", 10);
        panel.add(aTextField);
        panel.add(new JLabel("B��"));
        bTextField = new JTextField("B4", 10);
        panel.add(bTextField);
        JButton addButton = new JButton("���");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String[] rowValues = {aTextField.getText(),
                        bTextField.getText()};              // �������������
                tableModel.addRow(rowValues);              // ����ģ�������һ��
                int rowCount = table.getRowCount() + 1;
                aTextField.setText("A" + rowCount);
                bTextField.setText("B" + rowCount);
            }
        });
        panel.add(addButton);
        JButton updButton = new JButton("�޸�");
        updButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();  // ��ñ�ѡ���е�����
                if (selectedRow != -1) {                     // �ж��Ƿ���ڱ�ѡ����
                    // �޸ı��ģ�͵��е�ָ��ֵ
                    tableModel.setValueAt(aTextField.getText(), selectedRow, 0); 
                    // �޸ı��ģ�͵��е�ָ��ֵ
                    tableModel.setValueAt(bTextField.getText(), selectedRow, 1); 
                }
            }
        });
        panel.add(updButton);
        JButton delButton = new JButton("ɾ��");
        delButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();  // ��ñ�ѡ���е�����
                if (selectedRow != -1)                        // �ж��Ƿ���ڱ�ѡ����
                    tableModel.removeRow(selectedRow);       // �ӱ��ģ�͵���ɾ��ָ����
            } 
        });
        panel.add(delButton);
    }
}

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JTableDemo {
	public static void main(String args[]) {
		String[] columnNames = { "���", "����", "�Ա�" };
		String[][] tableValues = { { "1", "����", "��" }, { "2", "����", "Ů" }, { "3", "����", "Ů" }, { "4", "����", "��" }, };
		DefaultTableModel tableModel = new DefaultTableModel(tableValues, columnNames);
		JTable table = new JTable(tableModel);
		JScrollPane scrollPane = new JScrollPane(table);
		
		JFrame f = new JFrame();
		f.add(scrollPane,BorderLayout.CENTER);
		f.setBounds(100, 100, 240, 150);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}

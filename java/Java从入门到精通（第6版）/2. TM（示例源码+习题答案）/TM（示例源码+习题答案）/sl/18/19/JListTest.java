import java.awt.Container;
import java.awt.event.*;
import javax.swing.*;

public class JListTest extends JFrame {
	public JListTest() {
		Container cp = getContentPane(); // ��ȡ����������
		cp.setLayout(null); // ����ʹ�þ��Բ���
		// �����ַ������飬�����б���е�����
		String[] contents = { "�б�1", "�б�2", "�б�3", "�б�4", "�б�5", "�б�6" };
		JList<String> jl = new JList<>(contents); // �����б�����������Ϊ�������
		JScrollPane js = new JScrollPane(jl); // ���б����������
		js.setBounds(10, 10, 100, 109); // �趨������������ʹ�С
		cp.add(js);
		JTextArea area = new JTextArea(); // �����ı���
		JScrollPane scrollPane = new JScrollPane(area); // ���ı������������
		scrollPane.setBounds(118, 10, 73, 80); // �趨������������ʹ�С
		cp.add(scrollPane);
		JButton btnNewButton = new JButton("ȷ��"); // ����ȷ�ϰ�ť
		btnNewButton.setBounds(120, 96, 71, 23); // �趨��ť������ʹ�С
		cp.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() { // ��Ӱ�ť�¼�
			public void actionPerformed(ActionEvent e) {
				// ��ȡ�б���ѡ�е�Ԫ�أ�����java.util.List����
				java.util.List<String> values = jl.getSelectedValuesList();
				area.setText(""); // ����ı���
				for (String value : values) {
					area.append(value + "\n"); // ���ı���ѭ��׷��List�е�Ԫ��ֵ
				}
			}
		});
		setTitle("�����������ʹ�����б��");
		setSize(217, 167);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {
		new JListTest();
	}
}

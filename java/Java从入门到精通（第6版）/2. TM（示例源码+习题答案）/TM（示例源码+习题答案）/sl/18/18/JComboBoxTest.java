import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JComboBoxTest extends JFrame {
	public JComboBoxTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("�����б���ʹ��");
		setBounds(100, 100, 317, 147);
		getContentPane().setLayout(null); // ���þ��Բ���
		JLabel lblNewLabel = new JLabel("��ѡ��֤����");
		lblNewLabel.setBounds(28, 14, 80, 15);
		getContentPane().add(lblNewLabel);
		JComboBox<String> comboBox = new JComboBox<String>(); // ����һ�������б��
		comboBox.setBounds(110, 11, 80, 21); // ��������
		comboBox.addItem("���֤"); // Ϊ�����б��������
		comboBox.addItem("����֤");
		comboBox.addItem("ѧ��֤");
		comboBox.addItem("����֤");
		comboBox.setEditable(true);
		getContentPane().add(comboBox); // �������б���ӵ�������
		JLabel lblResult = new JLabel("");
		lblResult.setBounds(0, 57, 146, 15);
		getContentPane().add(lblResult);
		JButton btnNewButton = new JButton("ȷ��");
		btnNewButton.setBounds(200, 10, 67, 23);
		getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() { // Ϊ��ť��Ӽ����¼�
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// ��ȡ�����б��е�ѡ����
				lblResult.setText("��ѡ����ǣ�" + comboBox.getSelectedItem());
			}
		});
	}

	public static void main(String[] args) {
		JComboBoxTest frame = new JComboBoxTest(); // �����������
		frame.setVisible(true); // ʹ����ɼ�
	}
}

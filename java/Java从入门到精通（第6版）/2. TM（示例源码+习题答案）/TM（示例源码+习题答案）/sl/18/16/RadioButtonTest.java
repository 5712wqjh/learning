
import javax.swing.*;

public class RadioButtonTest extends JFrame {
	public RadioButtonTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("��ѡ��ť��ʹ��");
		setBounds(100, 100, 240, 120);
		getContentPane().setLayout(null); // ���þ��Բ���
		JLabel lblNewLabel = new JLabel("��ѡ���Ա�");
		lblNewLabel.setBounds(5, 5, 120, 15);
		getContentPane().add(lblNewLabel);
		JRadioButton rbtnNormal = new JRadioButton("��");
		rbtnNormal.setSelected(true);
		rbtnNormal.setBounds(40, 30, 75, 22);
		getContentPane().add(rbtnNormal);
		JRadioButton rbtnPwd = new JRadioButton("Ů");
		rbtnPwd.setBounds(120, 30, 75, 22);
		getContentPane().add(rbtnPwd);
		// ������ť�飬�ѽ�������еĵ�ѡ��ť��ӵ���ť����
		ButtonGroup group = new ButtonGroup();
		group.add(rbtnNormal);
		group.add(rbtnPwd);
	}

	public static void main(String[] args) {
		RadioButtonTest frame = new RadioButtonTest(); // �����������
		frame.setVisible(true); // ʹ����ɼ�
	}
}

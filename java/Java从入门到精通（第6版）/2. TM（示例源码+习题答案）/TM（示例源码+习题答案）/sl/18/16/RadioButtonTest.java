
import javax.swing.*;

public class RadioButtonTest extends JFrame {
	public RadioButtonTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("单选按钮的使用");
		setBounds(100, 100, 240, 120);
		getContentPane().setLayout(null); // 设置绝对布局
		JLabel lblNewLabel = new JLabel("请选择性别：");
		lblNewLabel.setBounds(5, 5, 120, 15);
		getContentPane().add(lblNewLabel);
		JRadioButton rbtnNormal = new JRadioButton("男");
		rbtnNormal.setSelected(true);
		rbtnNormal.setBounds(40, 30, 75, 22);
		getContentPane().add(rbtnNormal);
		JRadioButton rbtnPwd = new JRadioButton("女");
		rbtnPwd.setBounds(120, 30, 75, 22);
		getContentPane().add(rbtnPwd);
		// 创建按钮组，把交互面板中的单选按钮添加到按钮组中
		ButtonGroup group = new ButtonGroup();
		group.add(rbtnNormal);
		group.add(rbtnPwd);
	}

	public static void main(String[] args) {
		RadioButtonTest frame = new RadioButtonTest(); // 创建窗体对象
		frame.setVisible(true); // 使窗体可见
	}
}

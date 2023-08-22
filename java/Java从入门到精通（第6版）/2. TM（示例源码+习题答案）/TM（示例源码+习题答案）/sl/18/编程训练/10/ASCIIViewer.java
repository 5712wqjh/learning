
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

public class ASCIIViewer extends JFrame {

	private JPanel contentPane;
	private JTextField asciiTextField;
	private JTextField numberTextField;
	private JLabel label3;
	private JLabel label6;

	public static void main(String[] args) {
		ASCIIViewer frame = new ASCIIViewer();
		frame.setVisible(true);
	}

	public ASCIIViewer() {
		setTitle("十进制的ASCII编码查看器");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 150);
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(2, 1, 5, 5));

		JPanel asciiPanel = new JPanel();
		asciiPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.add(asciiPanel);
		asciiPanel.setLayout(new GridLayout(1, 5, 5, 5));

		JLabel label1 = new JLabel("输入字符：");
		label1.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		asciiPanel.add(label1);

		asciiTextField = new JTextField();
		asciiTextField.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		asciiPanel.add(asciiTextField);
		asciiTextField.setColumns(3);

		JLabel label2 = new JLabel("转换结果：");
		label2.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		asciiPanel.add(label2);

		label3 = new JLabel("");
		label3.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		asciiPanel.add(label3);

		JButton toNumberButton = new JButton("转换");
		toNumberButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_toNumberButton_actionPerformed(e);
			}
		});
		toNumberButton.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		asciiPanel.add(toNumberButton);

		JPanel numberPanel = new JPanel();
		numberPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.add(numberPanel);
		numberPanel.setLayout(new GridLayout(1, 5, 5, 5));

		JLabel label4 = new JLabel("输入数字：");
		label4.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		numberPanel.add(label4);

		numberTextField = new JTextField();
		numberTextField.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		numberPanel.add(numberTextField);
		numberTextField.setColumns(3);

		JLabel label5 = new JLabel("转换结果：");
		label5.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		numberPanel.add(label5);

		label6 = new JLabel("");
		label6.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		numberPanel.add(label6);

		JButton toASCIIButton = new JButton("转换");
		toASCIIButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_toASCIIButton_actionPerformed(e);
			}
		});
		toASCIIButton.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		numberPanel.add(toASCIIButton);
	}

	protected void do_toNumberButton_actionPerformed(ActionEvent e) {
		String ascii = asciiTextField.getText();
		if (ascii.length() == 1 ) {
			int i = Character.codePointAt(ascii, 0);
			label3.setText("" + i);
		} else {
			JOptionPane.showMessageDialog(null, "文本框中的字符个数不得超过1个！", "警告", JOptionPane.WARNING_MESSAGE);
		}
	}

	protected void do_toASCIIButton_actionPerformed(ActionEvent e) {
		try {
			String number = numberTextField.getText();
			if (Integer.parseInt(number) <= 126) {
				char[] a = Character.toChars(Integer.parseInt(number));
				label6.setText(new String(a));
			} else {
				JOptionPane.showMessageDialog(null, "十进制编码有效范围为0~126！", "警告", JOptionPane.WARNING_MESSAGE);
			}
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(null, "请在文本框中输入0~126范围内的整数！", "警告", JOptionPane.WARNING_MESSAGE);
		}
	}
}

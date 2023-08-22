
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class SimpleEvent extends JFrame {

	private JButton jb = new JButton("���ǰ�ť�������");

	public SimpleEvent() {
		setLayout(null);
		setSize(200, 100);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container cp = getContentPane();
		cp.add(jb);
		jb.setBounds(10, 10, 150, 30);
		jb.addActionListener(new jbAction());
		setVisible(true);
	}

	class jbAction implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			jb.setText("�ұ������");
		}
	}

	public static void main(String[] args) {
		new SimpleEvent();
	}
}

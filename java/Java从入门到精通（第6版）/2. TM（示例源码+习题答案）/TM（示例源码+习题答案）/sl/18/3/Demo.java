import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Demo {
	public static void main(String[] args) {
		Object o[] = {new JButton("�ǵ�"), new JButton("������")};   // ��ť�����Object����
		Icon icon = new ImageIcon("src/ע��.png");                      // ��ȡͼ�����
		JOptionPane.showOptionDialog(null, "������׼������", "ע���ˣ�",
		                    JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, icon, o, null);

	}
}

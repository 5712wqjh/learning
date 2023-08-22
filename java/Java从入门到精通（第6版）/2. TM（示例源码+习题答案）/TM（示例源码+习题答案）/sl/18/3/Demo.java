import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Demo {
	public static void main(String[] args) {
		Object o[] = {new JButton("是的"), new JButton("再想想")};   // 按钮对象的Object数组
		Icon icon = new ImageIcon("src/注意.png");                      // 获取图标对象
		JOptionPane.showOptionDialog(null, "你做好准备了吗？", "注意了！",
		                    JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, icon, o, null);

	}
}

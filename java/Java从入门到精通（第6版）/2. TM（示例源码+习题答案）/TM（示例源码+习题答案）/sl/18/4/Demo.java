
import javax.swing.JOptionPane;

public class Demo {
	public static void main(String[] args) {
		int answer = JOptionPane.showConfirmDialog(null,
				"确定离开吗？",
				"标题",
				JOptionPane.YES_NO_OPTION);
	}
}

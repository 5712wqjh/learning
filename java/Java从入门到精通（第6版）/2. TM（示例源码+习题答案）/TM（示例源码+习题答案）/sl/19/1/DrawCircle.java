
import java.awt.*;
import javax.swing.*;

public class DrawCircle extends JFrame {
	private final int OVAL_WIDTH = 80; // Բ�εĿ�
	private final int OVAL_HEIGHT = 80; // Բ�εĸ�

	public DrawCircle() {
		initialize(); // ���ó�ʼ������
	}

	private void initialize() {// ��ʼ������
		setSize(300, 200); // ���ô����С
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���ô���ر�ģʽ
		setContentPane(new DrawPanel()); // ���ô������Ϊ��ͼ������
		setTitle("��ͼʵ��1"); // ���ô������
	}

	class DrawPanel extends JPanel {// ������ͼ���
		public void paint(Graphics g) {// ��д���Ʒ���
			g.drawOval(10, 10, OVAL_WIDTH, OVAL_HEIGHT); // ���Ƶ�1��Բ��
			g.drawOval(80, 10, OVAL_WIDTH, OVAL_HEIGHT); // ���Ƶ�2��Բ��
			g.drawOval(150, 10, OVAL_WIDTH, OVAL_HEIGHT); // ���Ƶ�3��Բ��
			g.drawOval(50, 70, OVAL_WIDTH, OVAL_HEIGHT); // ���Ƶ�4��Բ��
			g.drawOval(120, 70, OVAL_WIDTH, OVAL_HEIGHT); // ���Ƶ�5��Բ��
		}
	}

	public static void main(String[] args) {
		new DrawCircle().setVisible(true);
	}
}

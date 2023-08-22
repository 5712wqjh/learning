import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.util.Date;
import javax.swing.*;

public class DrawString extends JFrame {

	public DrawString() {
		setSize(230, 140); // ���ô����С
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���ô���ر�ģʽ
		add(new CanvasPanel()); // ���ô������Ϊ��ͼ������
		setTitle("��ͼ�ı�"); // ���ô������
	}

	class CanvasPanel extends JPanel {
		public void paint(Graphics g) {
			Graphics2D g2 = (Graphics2D) g;
			Rectangle2D rect = new Rectangle2D.Double(10, 10, 200, 80);
			Font font = new Font("����", Font.BOLD, 16);
			Date date = new Date();
			g2.setColor(Color.CYAN); // ���õ�ǰ��ͼ��ɫ
			g2.fill(rect); // ������
			g2.setColor(Color.BLUE); // ���õ�ǰ��ͼ��ɫ
			g2.setFont(font); // ��������
			g2.drawString("����ʱ����", 20, 30); // �����ı�
			g2.drawString(String.format("%tr", date), 50, 60); // ����ʱ���ı�
		}
	}

	public static void main(String[] args) {
		new DrawString().setVisible(true);
	}
}

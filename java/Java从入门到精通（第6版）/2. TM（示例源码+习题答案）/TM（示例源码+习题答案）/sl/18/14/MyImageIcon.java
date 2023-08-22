
import java.awt.Container;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class MyImageIcon extends JFrame {
	public MyImageIcon() {
		Container container = getContentPane();
		//����һ����ǩ
		JLabel jl = new JLabel("����һ��JFrame����", JLabel.CENTER);
		//��ȡͼƬ���ڵ�URL
		URL url = MyImageIcon.class.getResource("pic.png");
		Icon icon = new ImageIcon(url); 		//����Icon����
		jl.setIcon(icon); 						//Ϊ��ǩ����ͼƬ
		//�������ַ����ڱ�ǩ�м�
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		jl.setOpaque(true); 					//���ñ�ǩΪ��͸��״̬
		container.add(jl); 						//����ǩ��ӵ�������
		setSize(300, 200); 						//���ô����С
		setVisible(true); 						//ʹ����ɼ�
		//���ô���ر�ģʽ
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	public static void main(String args[]) {
		new MyImageIcon(); 						//����MyImageIcon����
	}
}


import java.awt.*; //����AWT��
import javax.swing.*; //����Swing��

public class JFreamDemo {
	public static void main(String args[]) { // ������
		JFrame jf = new JFrame();// �����������
		jf.setTitle("����һ��JFrame����");// ���ô������
		Container container = jf.getContentPane(); // ��ȡ������
		JLabel jl = new JLabel("����һ��JFrame����");// һ���ı���ǩ
		jl.setHorizontalAlignment(SwingConstants.CENTER); // ʹ��ǩ�ϵ����־���
		container.add(jl); // ����ǩ��ӵ���������
		jf.setSize(300, 150); // ���ô�����
		jf.setLocation(320, 240);// ���ô�������Ļ�г��ֵ�λ��
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // �رմ�����ֹͣ����
		jf.setVisible(true); // �ô���չʾ����
	}
}

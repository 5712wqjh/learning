
import java.awt.*;
import javax.swing.*;
public class AbsolutePosition extends JFrame {
    public AbsolutePosition() {
        setTitle("������ʹ�þ��Բ���");               // �������
        setLayout(null);                              // ʹ��null����
        setBounds(0, 0, 300, 150);                  // ���ô������������
        Container c = getContentPane();            // ��ȡ������
        JButton b1 = new JButton("��ť1");          // ������ť
        JButton b2 = new JButton("��ť2"); 
        b1.setBounds(10, 30, 80, 30);               // ���ð�ť��λ�����С
        b2.setBounds(60, 70, 100, 20);
        c.add(b1); // ����ť��ӵ�������
        c.add(b2);
        setVisible(true);                               // ʹ����ɼ�
      
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);   // �رմ�����ֹͣ����
    }
    public static void main(String[] args) {
        new AbsolutePosition();
    }
}

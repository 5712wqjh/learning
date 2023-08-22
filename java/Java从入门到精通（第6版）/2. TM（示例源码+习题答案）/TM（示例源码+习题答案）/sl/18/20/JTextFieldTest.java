import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JTextFieldTest extends JFrame {
    public JTextFieldTest() {
        Container c = getContentPane();                        // ��ȡ����������
        c.setLayout(new FlowLayout());
        JTextField jt = new JTextField("���������ť");      // �趨�ı����ʼֵ
        jt.setColumns(20);                                       // �����ı��򳤶�
        jt.setFont(new Font("����", Font.PLAIN, 20));          // ��������
        JButton jb = new JButton("���");
        jt.addActionListener(new ActionListener() {            // Ϊ�ı�����ӻس��¼�
            public void actionPerformed(ActionEvent arg0) {
                jt.setText("�����¼�");                            // �����ı����е�ֵ
            }
        });
        jb.addActionListener(new ActionListener() {           // Ϊ��ť����¼�
            public void actionPerformed(ActionEvent arg0) {
                System.out.println(jt.getText());             // �����ǰ�ı����ֵ
                jt.setText("");                                // ���ı����ÿ�
                jt.requestFocus();                            // ����ص��ı���
            }
        });
        c.add(jt);                                              // ������������ı���
        c.add(jb);                                               // ������Ӱ�ť
        setBounds(100, 100, 250, 110);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new JTextFieldTest();
    }
}

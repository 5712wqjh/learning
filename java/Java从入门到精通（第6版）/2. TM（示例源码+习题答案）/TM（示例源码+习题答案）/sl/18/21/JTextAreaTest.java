import java.awt.*;
import javax.swing.*;
public class JTextAreaTest extends JFrame {
    public JTextAreaTest() {
        setSize(200, 100);
        setTitle("�����Զ����е��ı���");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        Container cp = getContentPane();                      // ��ȡ����������
        // ����һ���ı�����Ϊ���ı��򡱡��иߺ��п��Ϊ6���ı���
        JTextArea jt = new JTextArea("�ı���", 6, 6); 
        jt.setLineWrap(true);                                  // �����Զ�����
        cp.add(jt);
        setVisible(true);
    }
    public static void main(String[] args) {
        new JTextAreaTest();
    }
}

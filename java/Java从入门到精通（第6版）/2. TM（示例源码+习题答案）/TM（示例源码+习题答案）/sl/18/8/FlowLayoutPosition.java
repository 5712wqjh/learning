import java.awt.*;
import javax.swing.*;
public class FlowLayoutPosition extends JFrame {
    public FlowLayoutPosition() {
        setTitle("������ʹ�������ֹ�����");       // ���ô������
        Container c = getContentPane();
        // ����ʹ�������֣�����Ҷ��룬���֮���ˮƽ���Ϊ10���أ���ֱ���10����
        setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 10));
        for (int i = 0; i < 10; i++) {        // ��������ѭ�����10����ť
            c.add(new JButton("button" + i));
        }
        setSize(300, 200);                    // ���ô����С
       
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE); // �رմ�����ֹͣ����
        setVisible(true);                    // ���ô���ɼ�
    }
    public static void main(String[] args) {
        new FlowLayoutPosition();
    }
}

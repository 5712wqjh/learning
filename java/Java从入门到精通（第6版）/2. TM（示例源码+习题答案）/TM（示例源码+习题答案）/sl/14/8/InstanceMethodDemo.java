import java.text.SimpleDateFormat;
import java.util.Date;
interface InstanceMethodInterface {                    // �������Խӿ�
    String method(Date date);                           // �������ĳ��󷽷�
}
public class InstanceMethodDemo {
    public String format(Date date) {                  // ��ʽ������
        // �������ڸ�ʽ�����󣬲�ָ�����ڸ�ʽ
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);                       // ���ظ�ʽ�����
    }

    public static void main(String[] args) {
        // ���������
        InstanceMethodDemo demo = new InstanceMethodDemo();
        // ���������ķ���
        InstanceMethodInterface im = demo::format;
        Date date = new Date();                       // �������ڶ���
        System.out.println("Ĭ�ϸ�ʽ��" + date);     // ������ڶ���Ĭ�ϸ�ʽ
        // ��������ӿڷ���������ĸ�ʽ
        System.out.println("�ӿ�����ĸ�ʽ��" + im.method(date));
    }
}

import java.util.Scanner;

public class PunchClock {
    public static void main(String[] args) {
        String names = "���������ģ����壬���������ߣ����ܣ��׺ƣ����أ�Ľ�ݰ���������";
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("����������");
            String targetName = sc.next();
            if (names.indexOf(targetName) != -1) {
                System.out.println("ǩ���ɹ���лл");
            } else {
                System.out.println("��Ա�������ڣ�");
            }
        }
    }
}

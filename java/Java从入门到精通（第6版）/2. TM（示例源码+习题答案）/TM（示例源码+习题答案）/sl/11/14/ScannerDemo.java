
import java.util.Random;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Random r = new Random();// ���������
		int num = r.nextInt(100);// ��1~99ȡֵ
		int input = -1;// ��¼�û������ֵ
		Scanner sc = new Scanner(System.in);// ɨ����ɨ�����̨����
		while (true) {
			System.out.println("��һ��������Ƕ��٣�");
			input = sc.nextInt();// ��ȡ�û������һ������
			if (input > num) {// ������������
				System.out.print("����������ִ���! ");
			} else if (input < num) {// ���С�������
				System.out.print("�����������С��! ");
			} else if (input == num) {// ������������
				break;// ����ѭ��
			} else {
				System.out.println("������������! ");
			}
		}
		System.out.println("��ϲ������!");
		sc.close();// �ر�ɨ����
	}
}


import java.util.Scanner;

public class Arithmetic {
	public static void main(String[] args) {
		int num1 = 1, num2 = 1;// ǰ��������
		Scanner sc = new Scanner(System.in);// ����ɨ����������������
		System.out.print("������Ҫ�鿴��n�����е�nֵ��");
		int n = sc.nextInt();// ��¼�û����������
		for (int i = 2; i < n; i++) {// ��2��ʼ
			num1 = num1 + num2;// ��һ��������ǰ��������֮��
			// ����num1��num2��ֵ
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		System.out.println("��" + n + "����Ϊ" + num2);// ���ָ��λ���ϵ�����
		sc.close();
	}
}

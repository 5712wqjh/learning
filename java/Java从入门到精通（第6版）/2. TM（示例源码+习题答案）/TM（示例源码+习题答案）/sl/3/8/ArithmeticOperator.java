import java.util.Scanner;

public class ArithmeticOperator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // ����ɨ��������ȡ����̨�����ֵ
		System.out.println("�������������֣��ÿո����(num1 num2)��"); // �����ʾ
		double num1 = sc.nextDouble(); // ��¼����ĵ�һ������
		double num2 = sc.nextDouble(); // ��¼����ĵڶ�������
		System.out.println("num1+num2�ĺ�Ϊ��" + (num1 + num2)); // �����
		System.out.println("num1-num2�Ĳ�Ϊ��" + (num1 - num2)); // �����
		System.out.println("num1*num2�Ļ�Ϊ��" + (num1 * num2)); // �����
		System.out.println("num1/num2����Ϊ��" + (num1 / num2)); // ������
		System.out.println("num1%num2������Ϊ��" + (num1 % num2)); // ��������
		sc.close();// �ر�ɨ����
	}
}

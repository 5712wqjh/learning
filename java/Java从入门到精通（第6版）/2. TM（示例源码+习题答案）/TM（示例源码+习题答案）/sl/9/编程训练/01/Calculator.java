
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {// ����һ��Number��
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // ����̨����
		try {// try��
			System.out.println("�������һ��������"); // ��ʾ��Ϣ
			int num1 = sc.nextInt(); // ����һ��int���͵ı���num1���տ���̨�������Ϣ

			System.out.println("�������������(+��-��*��/)��"); // ��ʾ��Ϣ
			String symbol = sc.next(); // ����һ��String���͵ı���symbol���տ���̨�������Ϣ

			System.out.println("������ڶ���������"); // ��ʾ��Ϣ
			int num2 = sc.nextInt(); // ����һ��int���͵ı���num1���տ���̨�������Ϣ

			int result = 0; // ���岢��ʼ������������

			switch (symbol) {
			case "+":
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			case "/":
				if (num2 != 0) {
					result = num1 / num2;
				} else {
					System.out.println("������ô�����ǡ�0���أ�");
					return;
				}
				break;
			}
			System.out.println("��������" + result); // ���������
		} catch (InputMismatchException ime) {// catch��
			System.out.println("�Բ���������Ĳ����������Ѿ�������" + ime.toString() + "�쳣��\n" + "�����û��������Ϣ��涨�Ĳ������Ͳ���ʱ���ֵ��쳣"); // ����쳣����Ϣ
		}
		sc.close();
	}
}

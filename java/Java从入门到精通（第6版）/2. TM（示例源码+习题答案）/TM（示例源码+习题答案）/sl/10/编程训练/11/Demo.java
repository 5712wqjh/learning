import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ��4λ�����֣�");
		String numbers = sc.next();
		if (numbers.length() == 4) {
			boolean b = numbers.matches("(..)\\1");
			if (b) {
				System.out.println(numbers + "��ABAB��ʽ�����֣�");
			} else {
				System.out.println(numbers + "����ABAB��ʽ�����֣�");
			}
		} else {
			System.out.println("������һ��4λ�����֣�");
		}
		sc.close();
	}
}
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个4位的数字：");
		String numbers = sc.next();
		if (numbers.length() == 4) {
			boolean b = numbers.matches("(..)\\1");
			if (b) {
				System.out.println(numbers + "是ABAB形式的数字！");
			} else {
				System.out.println(numbers + "不是ABAB形式的数字！");
			}
		} else {
			System.out.println("请输入一个4位的数字！");
		}
		sc.close();
	}
}
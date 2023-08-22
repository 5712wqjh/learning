import java.util.Scanner;

public class ArithmeticOperator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 创建扫描器，获取控制台输入的值
		System.out.println("请输入两个数字，用空格隔开(num1 num2)："); // 输出提示
		double num1 = sc.nextDouble(); // 记录输入的第一个数字
		double num2 = sc.nextDouble(); // 记录输入的第二个数字
		System.out.println("num1+num2的和为：" + (num1 + num2)); // 计算和
		System.out.println("num1-num2的差为：" + (num1 - num2)); // 计算差
		System.out.println("num1*num2的积为：" + (num1 * num2)); // 计算积
		System.out.println("num1/num2的商为：" + (num1 / num2)); // 计算商
		System.out.println("num1%num2的余数为：" + (num1 % num2)); // 计算余数
		sc.close();// 关闭扫描器
	}
}

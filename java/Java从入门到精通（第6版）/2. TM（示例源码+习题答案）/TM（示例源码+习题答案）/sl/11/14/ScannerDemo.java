
import java.util.Random;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Random r = new Random();// 随机数对象
		int num = r.nextInt(100);// 从1~99取值
		int input = -1;// 记录用户输入的值
		Scanner sc = new Scanner(System.in);// 扫描器扫描控制台输入
		while (true) {
			System.out.println("猜一猜随机数是多少？");
			input = sc.nextInt();// 获取用户输入的一个整数
			if (input > num) {// 如果大于随机数
				System.out.print("你输入的数字大了! ");
			} else if (input < num) {// 如果小于随机数
				System.out.print("你输入的数字小了! ");
			} else if (input == num) {// 如果等于随机数
				break;// 结束循环
			} else {
				System.out.println("您的输入有误! ");
			}
		}
		System.out.println("恭喜你答对了!");
		sc.close();// 关闭扫描器
	}
}

import java.util.Scanner;

public class Mailbox {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入QQ邮箱：");
		String qqMail = sc.next();
		int index = qqMail.indexOf('@');
		String qqNum = qqMail.substring(0, index);
		System.out.println("这个邮箱对应的qq号：" + qqNum + "。");
		sc.close();
	}
}

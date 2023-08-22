import java.util.Scanner; //引入Scanner类

public class LoginService {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 创建扫描器，获取控制台输入的值
		int password; // 保存用户输入的密码
		do {
			System.out.println("请输入6位数字密码:"); // 输出提示
			password = sc.nextInt(); // 将用户在控制台输入的密码记录下来
		} while (931567 != password);// 如果用户输入的密码不是"931567"则继续执行循环
		System.out.println("登陆成功"); // 提示循环已结束
		sc.close(); // 关闭扫描器
	}
}

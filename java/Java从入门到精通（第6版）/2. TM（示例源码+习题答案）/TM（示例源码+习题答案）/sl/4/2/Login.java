
public class Login {
	public static void main(String[] args) {
		int password = 987654321;// 密码值
		if (123456789 == password) {// 如果密码是123456789
			System.out.println("密码正确，欢迎登录");// 密码正确的提示
		} else {// 否则
			System.out.println("密码错误，拒绝登录");// 密码错误的提示
		}
	}
}

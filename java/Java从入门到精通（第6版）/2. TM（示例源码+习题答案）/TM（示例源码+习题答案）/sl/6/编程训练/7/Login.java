
public class Login {
	public static void main(String[] args) {
		if (args[0].equals("张三") && args[1].equals("123456")) {
			System.out.println("开始执行……");
		} else {
			System.out.println("您的权限无法运行此程序");
		}
	}
}

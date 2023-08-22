
interface SayHiInterface { // 打招呼接口
	String say(); // 打招呼的方法
}

public class NoParamterDemo { // 测试类
	public static void main(String[] args) {
		// lambda表达式实现打招呼接口，返回抽象方法结果
		SayHiInterface pi = () -> "你好啊，这是里lambda表达式";
		System.out.println(pi.say()); 
	}
}

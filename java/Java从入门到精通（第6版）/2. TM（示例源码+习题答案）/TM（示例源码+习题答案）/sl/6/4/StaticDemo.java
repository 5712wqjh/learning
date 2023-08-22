
public class StaticDemo {
	static double PI = 3.1415; // 在类中定义静态常量

	public static void method() { // 在类中定义静态方法
		System.out.println("这是静态方法");
	}

	public static void main(String[] args) {
		System.out.println(StaticDemo.PI); // 调用静态常量
		StaticDemo.method(); // 调用静态方法
	}
}

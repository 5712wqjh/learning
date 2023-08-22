interface ConstructorsInterface1 { // 构造方法接口
	ConstructorsDemo1 action(); // 调用无参方法
}

public class ConstructorsDemo1 { // 测试类

	public ConstructorsDemo1() { // 无参构造方法
		System.out.println("调用无参构造方法");
	}

	public ConstructorsDemo1(int i) { // 有参构造方法
		System.out.println("调用有参构造方法");
	}

	public static void main(String[] args) {
		// 引用ConstructorsTest1类的构造方法
		ConstructorsInterface1 a = ConstructorsDemo1::new;
		ConstructorsDemo1 b = a.action(); // 通过无参方法创建对象

	}
}
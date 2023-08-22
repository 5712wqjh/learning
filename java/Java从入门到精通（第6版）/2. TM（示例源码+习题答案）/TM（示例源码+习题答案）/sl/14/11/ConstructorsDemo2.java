interface ConstructorsInterface2 { // 构造方法接口
	ConstructorsDemo2 action(int i); // 调用有参方法
}

public class ConstructorsDemo2 { // 测试类

	public ConstructorsDemo2() { // 无参构造方法
		System.out.println("调用无参构造方法");
	}

	public ConstructorsDemo2(int i) { // 有参构造方法
		System.out.println("调用有参构造方法，参数为:" + i);
	}

	public static void main(String[] args) {
		// 引用ConstructorsDemo2类的构造方法
		ConstructorsInterface2 a = ConstructorsDemo2::new;
		ConstructorsDemo2 b = a.action(123); // 通过有参方法创建对象
	}
}

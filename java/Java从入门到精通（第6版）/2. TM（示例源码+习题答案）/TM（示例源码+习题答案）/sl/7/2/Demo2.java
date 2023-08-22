class Telephone { // 电话类
	String button = "button:0~9"; // 成员属性，10个按键
	void call() { // 拨打电话功能
		System.out.println("开始拨打电话");
	}
}

class Mobile extends Telephone { // 手机类继承电话类
	String screen = "screen:液晶屏"; // 成员属性，液晶屏幕
}

public class Demo2{
	public static void main(String[] args) {
		Mobile motto = new Mobile();
		System.out.println(motto.button); // 子类调用父类属性
		System.out.println(motto.screen); // 子类调用父类没有的属性
		motto.call(); // 子类调用父类方法
	}
}

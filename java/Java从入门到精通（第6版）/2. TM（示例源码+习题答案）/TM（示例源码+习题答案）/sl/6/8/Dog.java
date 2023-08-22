
public class Dog {// 狗
	String name;// 名字
	String Color;// 颜色
	String vioce;// 声音

	public Dog(String name, String color, String vioce) {
		this.name = name;
		Color = color;
		this.vioce = vioce;
	}

	public void call() {// 叫
		System.out.println(vioce);
	}

	public static void main(String[] args) {
		Dog d1 = new Dog("毛毛", "白色", "汪汪汪");
		System.out.print(d1.name + "的颜色是" + d1.Color);// 访问对象的属性
		System.out.print("，叫起来的声音:");
		d1.call();// 访问对象的行为

		Dog d2 = new Dog("灰灰", "灰色", "嗷呜~");
		System.out.print(d2.name + "的颜色是" + d2.Color);
		System.out.print("，叫起来的声音:");
		d2.call();
	}
}

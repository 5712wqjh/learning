
public class Cust {// 顾客类
	static int count = 0;// 共享的属性：人数
	String name;// 名称属性

	public Cust(String name) {
		this.name = name;// 记录名称
		count++;// 人数递增
	}

	public static void main(String[] args) {
		Cust c1 = new Cust("tom");
		System.out.println("我是第" + Cust.count + "名顾客，我叫" + c1.name);

		Cust c2 = new Cust("张三");
		System.out.println("我是第" + Cust.count + "名顾客，我叫" + c2.name);

		Cust c3 = new Cust("狗蛋儿");
		System.out.println("我是第" + Cust.count + "名顾客，我叫" + c3.name);
	}
}

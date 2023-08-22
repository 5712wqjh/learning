
public class People {
	int id;// 身份证号
	String name;//名字

	public People(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public boolean equals(Object obj) {// 重写Object的equals()方法
		if (this == obj)// 如果参数与本类是同一个对象
			return true;
		if (obj == null)// 如果参数是null
			return false;
		if (getClass() != obj.getClass())// 如果参数与本类类型不同
			return false;
		People other = (People) obj;// 将参数强转成本类对象
		if (id != other.id)// 如果两者的身份证号不相等
			return false;
		return true;
	}

	public String toString() {// 重写Object的toString()方法
		return  name;//只输出名字
	}

	public static void main(String[] args) {
		People p1 = new People(220, "tom");
		People p2 = new People(220, "汤姆");
		People p3 = new People(330, "张三");
		Object o = new Object();
		
		System.out.println(p1+"与"+p2+"是否为同一人？");
		System.out.println("equals()方法的结果："+p1.equals(p2));
		System.out.println("==运算符的结果："+(p1 == p2));
		
		System.out.println();
		System.out.print(p1+"与"+p3+"是否为同一人？");
		System.out.println(p1.equals(p3));
		
		System.out.print(p1+"与"+o+"是否为同一人？");
		System.out.println(p1.equals(o));
	}
}

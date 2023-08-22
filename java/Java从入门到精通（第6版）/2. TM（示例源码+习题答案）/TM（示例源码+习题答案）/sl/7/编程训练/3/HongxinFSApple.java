
class Apple {
	String color;
	String name;
	double weight;
	double price;
	
	public Apple(String color, String name, double price, double weight) {
		this.color = color;
		this.name = name;
		this.weight = weight;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return this.color + "的苹果被称为“" + this.name + "”, 每500克" + this.price + "元RMB，买了" + this.weight + "克，需支付" + (float)(this.price * (this.weight / 500)) + "元RMB。";
	}
}
public class HongxinFSApple {
	public static void main(String[] args) {
		Apple apple = new Apple("红色", "糖心富士", 4.98, 2500);
		System.out.println(apple.toString());
	}
}


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
		return this.color + "��ƻ������Ϊ��" + this.name + "��, ÿ500��" + this.price + "ԪRMB������" + this.weight + "�ˣ���֧��" + (float)(this.price * (this.weight / 500)) + "ԪRMB��";
	}
}
public class HongxinFSApple {
	public static void main(String[] args) {
		Apple apple = new Apple("��ɫ", "���ĸ�ʿ", 4.98, 2500);
		System.out.println(apple.toString());
	}
}

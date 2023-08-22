
class Bird {
	public void fly() {
		System.out.println("鸟类都会飞么？");
	}
}
public class Chicken extends Bird {
	@Override
	public void fly() {
		System.out.println("鸡就不会飞！");
	}
	public static void main(String[] args) {
		Chicken chicken = new Chicken();
		System.out.println("鸡是否属于鸟类？");
		if (chicken instanceof Bird) {
			System.out.println("鸡属于鸟类。");
			Bird bird = new Bird();
			bird.fly();
			chicken.fly();
		} else {
			System.out.println("鸡不属于鸟类！！！");
		}
	}
}

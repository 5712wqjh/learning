
class Bird {
	public void fly() {
		System.out.println("���඼���ô��");
	}
}
public class Chicken extends Bird {
	@Override
	public void fly() {
		System.out.println("���Ͳ���ɣ�");
	}
	public static void main(String[] args) {
		Chicken chicken = new Chicken();
		System.out.println("���Ƿ��������ࣿ");
		if (chicken instanceof Bird) {
			System.out.println("���������ࡣ");
			Bird bird = new Bird();
			bird.fly();
			chicken.fly();
		} else {
			System.out.println("�����������࣡����");
		}
	}
}

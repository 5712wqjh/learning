class Human {
	Heart heart = new Heart();

	class Heart {
		void beating() {
			System.out.println("��������");
		}
	}

	void walk() {
		System.out.println("������·");
		heart.beating();
	}
}

public class Demo {
	public static void main(String[] args) {
		Human tom = new Human();
		tom.walk();
	}
}

class Rabbit extends Thread {
	public Rabbit() {
		setPriority(10);
	}

	public void run() {
		String tmp = "";
		for (int i = 0; i < 50000; i++) {
			tmp += i;
		}
		System.out.println("�������");
	}
}

class Tortoise extends Thread {
	public Tortoise() {
		setPriority(1);
	}

	public void run() {
		String tmp = "";
		for (int i = 0; i < 50000; i++) {
			tmp += i;
		}
		System.out.println("�ڹ����");
	}
}

public class Demo {
	public static void main(String[] args) {
		new Tortoise().start();
		new Rabbit().start();
	}
}

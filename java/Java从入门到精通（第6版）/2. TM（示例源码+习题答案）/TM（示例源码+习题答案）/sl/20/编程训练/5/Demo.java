class Rabbit extends Thread {
	public Rabbit() {
		setPriority(10);
	}

	public void run() {
		String tmp = "";
		for (int i = 0; i < 50000; i++) {
			tmp += i;
		}
		System.out.println("兔子完成");
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
		System.out.println("乌龟完成");
	}
}

public class Demo {
	public static void main(String[] args) {
		new Tortoise().start();
		new Rabbit().start();
	}
}

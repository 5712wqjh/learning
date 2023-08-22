
public class Pool {
	int capacity = 100;

	public synchronized boolean drainage(int value) {
		if (capacity == 0) {
			return false;
		} else {
			capacity -= value;
			capacity = capacity < 0 ? 0 : capacity;
			System.out.println("ˮ�ػ�ʣ" + capacity + "��ˮ");
			return true;
		}
	}

	public void startThread() {
		Thread a = new Outfall("A", 1);
		Thread b = new Outfall("B", 2);
		Thread c = new Outfall("C", 3);
		a.start();
		b.start();
		c.start();
	}

	class Outfall extends Thread {
		String name;
		int value;

		public Outfall(String name, int value) {
			this.name = name;
			this.value = value;
		}

		public void run() {
			while (drainage(value)) {
				System.out.println(name + "��ˮ�������ˮ");
			}
		}
	}

	public static void main(String[] args) {
		Pool p = new Pool();
		p.startThread();
	}
}

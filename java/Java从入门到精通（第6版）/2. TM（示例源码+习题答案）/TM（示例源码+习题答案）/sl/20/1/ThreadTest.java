
public class ThreadTest extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		ThreadTest t = new ThreadTest();
		t.start();
	}
}

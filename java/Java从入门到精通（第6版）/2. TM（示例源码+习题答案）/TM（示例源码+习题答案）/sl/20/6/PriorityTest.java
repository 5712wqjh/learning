
public class PriorityTest implements Runnable {
	String name;

	public PriorityTest(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		String tmp = "";
		for (int i = 0; i < 50000; i++) {// 完成五万次字符串拼接
			tmp += i;
		}
		System.out.println(name + "线程完成任务");
	}

	public static void main(String[] args) {
		Thread a = new Thread(new PriorityTest("A"));
		a.setPriority(1);// A线程优先级最小
		Thread b = new Thread(new PriorityTest("B"));
		b.setPriority(3);
		Thread c = new Thread(new PriorityTest("C"));
		c.setPriority(7);
		Thread d = new Thread(new PriorityTest("D"));
		d.setPriority(10);// D线程优先级最大
		a.start();
		b.start();
		c.start();
		d.start();
	}
}


class Cust extends Thread {
	String name;

	public Cust(String name,int priority) {
		super();
		this.name = name;
		setPriority(priority);
	}

	@Override
	public void run() {
		int count = 0;
		while (Ticket.sell()) {
			count++;
			System.out.println("һ��" + name + "�򵽳�Ʊ������" + count + "��" + name + "�򵽳�Ʊ��");
		}
	}

}

public class Ticket {
	static int count = 100000;

	public static synchronized boolean sell() {
		if (count == 0) {
			return false;
		} else {
			count--;
			return true;
		}
	}

	public static void main(String[] args) {
		new Cust("����",10).start();
		new Cust("����",7).start();
		new Cust("��ͯ",5).start();
		new Cust("����",3).start();
	}
}


public class StaticDemo {
	static double PI = 3.1415; // �����ж��徲̬����

	public static void method() { // �����ж��徲̬����
		System.out.println("���Ǿ�̬����");
	}

	public static void main(String[] args) {
		System.out.println(StaticDemo.PI); // ���þ�̬����
		StaticDemo.method(); // ���þ�̬����
	}
}

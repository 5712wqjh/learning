
public class Snail {
	public static void main(String[] args) {
		int distance = 0;
		int day = 1;
		while (true) {
			distance += 2;
			if (distance >= 10) {
				break;
			}
			distance -= 1;
			day++;
		}
		System.out.println("��ţ��" + day + "�������˾��ڡ�");
	}
}

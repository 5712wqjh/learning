import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������û�����");
		String username = sc.nextLine();
		System.out.println("���������룺");
		String password = sc.nextLine();
		if ("mr".equals(username) || "123456".equals(password)) {
			System.out.println("��¼�ɹ�");
		} else {
			System.out.println("�û������������");
		}

		sc.close();
	}
}

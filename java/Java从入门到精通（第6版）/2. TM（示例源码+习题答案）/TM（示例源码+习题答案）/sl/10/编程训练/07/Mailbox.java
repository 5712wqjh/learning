import java.util.Scanner;

public class Mailbox {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����QQ���䣺");
		String qqMail = sc.next();
		int index = qqMail.indexOf('@');
		String qqNum = qqMail.substring(0, index);
		System.out.println("��������Ӧ��qq�ţ�" + qqNum + "��");
		sc.close();
	}
}

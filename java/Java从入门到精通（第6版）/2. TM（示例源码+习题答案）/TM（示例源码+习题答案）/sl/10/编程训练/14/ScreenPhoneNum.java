import java.util.Scanner;

public class ScreenPhoneNum {
	public static void main(String[] args) {
		System.out.println("�������ֻ��ţ�");
		Scanner sc = new Scanner(System.in);
		String phoneNum = sc.next();
		StringBuilder sbd = new StringBuilder(phoneNum);
		if (sbd.length() == 11) {
			sbd.replace(3, 7, "****");
			System.out.println("�ֻ���" + phoneNum + "���κ��Ч����" + sbd.toString());
		} else {
			System.out.println("������ֻ�������");
		}
		sc.close();
	}
}


import java.util.Scanner;

public class Seasons {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ĳ���·ݣ�1~12����");
		int month = sc.nextInt();
		if (month < 1 || month > 12) {
			System.out.println("���棺���ڷǷ���������");
		} else {
			switch (month) {
			case 3:
			case 4:
			case 5:
				System.out.println(month + "����ֵ����");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println(month + "����ֵ�ļ�");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println(month + "����ֵ�＾");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println(month + "����ֵ����");
				break;
			}
		}
		sc.close();
	}
}

import java.util.Scanner;

public class Punctuation {
	public static void main(String[] args) {
		StringBuilder sbd = new StringBuilder("�ܳ�ûС��");
		System.out.println("δ��ӱ����ַ�����" + sbd.toString());
		System.out.println("�������ڵڼ������ֺ�Ӷ��ţ�");
		Scanner sc = new Scanner(System.in);
		int position = sc.nextInt();
		sbd.insert(position, "��");
		System.out.println("��ӱ�����ַ�����" + sbd.toString());
		sc.close();
	}
}

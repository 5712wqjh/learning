import java.util.Scanner;

public class ScoreLevel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���������ķ�����");
		int score = sc.nextInt();
		if (score >= 90 && score <= 100) {
			System.out.println("���ķ���" + score + "��Ӧ�ĵȼ�Ϊ�����㡱");
		} else if (score >= 80 && score < 90) {
			System.out.println("���ķ���" + score + "��Ӧ�ĵȼ�Ϊ�����á�");
		} else if (score >= 60 && score < 80) {
			System.out.println("���ķ���" + score + "��Ӧ�ĵȼ�Ϊ���ϸ�");
		} else if (score < 60 && score >= 0) {
			System.out.println("���ķ���" + score + "��Ӧ�ĵȼ�Ϊ�����ϸ�");
		} else {
			System.out.println("��Ч�ɼ�");
		}
		sc.close();
	}
}

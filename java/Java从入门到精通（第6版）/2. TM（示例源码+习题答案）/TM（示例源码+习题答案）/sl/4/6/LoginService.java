import java.util.Scanner; //����Scanner��

public class LoginService {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // ����ɨ��������ȡ����̨�����ֵ
		int password; // �����û����������
		do {
			System.out.println("������6λ��������:"); // �����ʾ
			password = sc.nextInt(); // ���û��ڿ���̨����������¼����
		} while (931567 != password);// ����û���������벻��"931567"�����ִ��ѭ��
		System.out.println("��½�ɹ�"); // ��ʾѭ���ѽ���
		sc.close(); // �ر�ɨ����
	}
}

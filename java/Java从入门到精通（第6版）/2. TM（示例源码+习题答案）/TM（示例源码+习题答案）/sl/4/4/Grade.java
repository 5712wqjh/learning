import java.util.Scanner;						//����Scanner��
public class Grade {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in); 		// ����ɨ���������տ���̨��������
		System.out.print("������ɼ���");			// ����ַ���
		int grade = sc.nextInt();					// ��ȡ����̨���������
		switch (grade) {							// ʹ��switch�ж�����
		case 10:									// �������10�������ִ����һ�д���
		case 9:									// �������9
			System.out.println("�ɼ�Ϊ��");		// ����ɼ�Ϊ��
			break;								// �����ж�
		case 8:									// �������8
			System.out.println("�ɼ�Ϊ��");		// ����ɼ�Ϊ��
			break;								// �����ж�
		case 7:									// �������7�������ִ����һ�д���
		case 6:										// �������6
			System.out.println("�ɼ�Ϊ��");			// ����ɼ�Ϊ��
			break;									// �����ж�
		case 5:										// �������5�������ִ����һ�д���
		case 4:										// �������4�������ִ����һ�д���
		case 3:										// �������3�������ִ����һ�д���
		case 2:										// �������5�������ִ����һ�д���
		case 1:										// �������1�������ִ����һ�д���
		case 0: 										// �������0
			System.out.println("�ɼ�Ϊ��");			// ����ɼ�Ϊ��
			break;									// �����ж�
		default:										// ��������������κ�һ�����
			System.out.println("�ɼ���Ч");			// ����ɼ���Ч
		}
		sc.close();									// �ر�ɨ����
	}
}

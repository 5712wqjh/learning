
public class Poetry {
	public static void main(String[] args) {
		char arr[][] = new char[4][]; // ����һ��4�еĶ�ά����
		arr[0] = new char[] { '��', '��', '��', '��', '��' }; // Ϊÿһ�и�ֵ
		arr[1] = new char[] { '��', '��', '��', '��', '��' };
		arr[2] = new char[] { 'ҹ', '��', '��', '��', '��' };
		arr[3] = new char[] { '��', '��', '֪', '��', '��' };
		/* ������ */
		System.out.println("-----���-----");
		for (int i = 0; i < 4; i++) { // ѭ��4��
			for (int j = 0; j < 5; j++) { // ѭ��5��
				System.out.print(arr[i][j]); // ��������е�Ԫ��
			}
			if (i % 2 == 0) {
				System.out.println(","); // �����һ�����䣬�������
			} else {
				System.out.println("��"); // ����Ƕ����ľ䣬������
			}
		}
		/* ������� */
		System.out.println("\n-----����-----");
		for (int j = 0; j < 5; j++) { // �б���
			for (int i = 3; i >= 0; i--) { // �б��У��������
				System.out.print(arr[i][j]); // ��������е�Ԫ��
			}
			System.out.println(); // ����
		}
		System.out.println("��������"); // ������ı��
	}
}

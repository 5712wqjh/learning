
public class Demo {
	public static void main(String[] args) {
		String str = "dave1234";
		if (check(str)) {
			System.out.println("���������Ҫ��");
		} else {
			System.out.println("�밴Ҫ�������������롭��");
		}
	}

	public static boolean check(String str) {
		// �ж�����������Ƿ���ֹ涨������ַ�
		if (!str.matches("[a-zA-Z0-9]{8,20}"))
			return false;

		// ��¼���ּ����ַ�
		int count = 0;

		// �������Сд��ĸ
		if (str.matches(".*[a-z].*"))
			count++;
		// ������ִ�д��ĸ
		if (str.matches(".*[A-Z].*"))
			count++;
		// �����������
		if (str.matches(".*[0-9].*"))
			count++;
		// ���count < 2
		if (count < 2) {
			System.out.println("�������");
			return false;
		} else
			return true;
	}
}
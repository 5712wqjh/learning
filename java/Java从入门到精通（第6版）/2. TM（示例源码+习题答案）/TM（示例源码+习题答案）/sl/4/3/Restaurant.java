public class Restaurant {
	public static void main(String args[]) {
		System.out.println("��ӭ���٣������ж������òͣ�"); // ���������ʾ
		int count = 9; // �ò�����
		System.out.println("�ش�" + count + "��");// ����ش�
		if (count <= 4) { // �������С��4��
			System.out.println("�����뵽����4�����ò�"); // �뵽4����
		} else if (count > 4 && count <= 8) { // ���������4-8��֮��
			System.out.println("�����뵽����8�����ò�"); // �뵽4����
		} else if (count > 8 && count <= 16) { // ���������8-16��֮��
			System.out.println("�����뵽¥�ϰ����ò�"); // �뵽����
		} else { // ������������������ʱ��ִ�еĸ�����
			System.out.println("��Ǹ�����ǵ���ʱû����ô��İ��ᣡ"); // �����Ϣ
		}
	}
}

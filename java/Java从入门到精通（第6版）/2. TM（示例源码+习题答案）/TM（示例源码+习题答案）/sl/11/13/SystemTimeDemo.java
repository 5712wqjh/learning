public class SystemTimeDemo {
	public static void main(String[] args) {
		long start = System.currentTimeMillis(); // ����ʼ��¼ʱ��
		String str = null; // ����null�ַ���
		for (int i = 0; i < 10000; i++) { // ѭ��һ���
			str += i; // �ַ�����ѭ������ƴ��
		}
		long end = System.currentTimeMillis(); // ��¼ѭ������ʱ��
		System.out.println("ѭ����ʱ��" + (end - start) + "����");
	}
}

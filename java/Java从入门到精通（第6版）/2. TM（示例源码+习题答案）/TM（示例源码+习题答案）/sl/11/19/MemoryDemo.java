public class MemoryDemo {
	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime(); // ��ȡ����Runtime����
		Integer ints[] = new Integer[10000]; // ��������Ϊһ�����������
		long before = r.freeMemory(); // ��ȡ��ǰ�����ڴ���
		System.out.println("��ֵǰ�����ڴ��ֽ�����" + before);
		// ѭ��Ϊ�������鸳ֵ
		for (int i = 0, length = ints.length; i < length; i++) {
			ints[i] = i;// ��ֵ
		}
		long after = r.freeMemory(); // ��ȡ��ǰ�����ڴ���
		System.out.println("��ֵ������ڴ��ֽ�����" + after);
		// ��������õ����ڴ���
		System.out.println("�����õ����ڴ��ֽ�����" + (before - after));
	}
}

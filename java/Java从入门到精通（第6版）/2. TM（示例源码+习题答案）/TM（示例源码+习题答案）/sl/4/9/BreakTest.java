public class BreakTest {
	public static void main(String[] args) {
		for (int i = 1; i < 20; i++) {		// ���i��ż��
			if (i % 2 == 0) {				// ���i��ż��
				System.out.println(i);		// ���i��ֵ
				break;						// ������һѭ��
			}
		}
		System.out.println("---end---");		// ����ʱ���һ������
	}
}

public class BreakInsideNested2 {
	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {// ���ѭ��
			for (int j = 1; j <= 5; j++) {// �ڲ�ѭ��
				if (j == 4) { // �ڲ�ѭ������4��ʱ�ͽ���
					break;
				}
				System.out.println("i=" + i + " j=" + j);
			}
		}
	}
}

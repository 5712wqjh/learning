public class BreakInsideNested {
	public static void main(String[] args) {
		Loop: for (int i = 1; i <= 3; i++) {// ���ѭ��������˱�ǩ
			for (int j = 1; j <= 5; j++) {// �ڲ�ѭ��
				if (j == 4) { // �ڲ�ѭ������4��ʱ�ͽ���
					break Loop;// ����ָ��λ�õ�ѭ��
				}
				System.out.println("i=" + i + " j=" + j);
			}
		}
	}
}

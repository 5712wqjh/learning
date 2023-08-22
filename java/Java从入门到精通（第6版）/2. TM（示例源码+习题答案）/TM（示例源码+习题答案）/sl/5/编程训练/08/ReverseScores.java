import java.util.Arrays;

public class ReverseScores {
	public static void main(String[] args) {
		// ����һ�����飬��10��ѧ����Ӣ�ﾺ���ɼ��洢�����������
		int[] array = { 71, 89, 67, 53, 78, 64, 92, 56, 74, 85 };
		// ������ת������Ķ���
		ReverseScores reScores = new ReverseScores();
		// �����������ķ����������鷴ת
		reScores.sort(array);
	}

	/**
	 * ��ת����
	 * 
	 * @param array Ҫ���������
	 */
	public void sort(int[] array) {
		Arrays.sort(array);
		int temp;
		int len = array.length;
		for (int i = 0; i < len / 2; i++) {
			temp = array[i];
			array[i] = array[len - 1 - i];
			array[len - 1 - i] = temp;
		}
		System.out.println("��10��ѧ����Ӣ�ﾺ���ɼ��ɴ�С���������Ľ��������ʾ��");
		showArray(array); // �������������Ԫ��
	}

	/**
	 * ��ʾ�����е�����Ԫ��
	 * 
	 * @param array Ҫ��ʾ������
	 */
	public void showArray(int[] array) {
		for (int i : array) { // ��������
			System.out.print("\t" + i); // ���ÿ������Ԫ��ֵ
		}
		System.out.println();
	}
}

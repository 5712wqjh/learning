public class GetSum {
	public static void main(String args[]) {
		int x = 1; // ��1��ʼ
		int sum = 0; // ��ӵĽ��
		while (x <= 1000) {// ѭ��1000��
			sum = sum + x; // sum��֮ǰ����ĺ����
			x++; // ÿ��ѭ����x��ֵ+1
		}
		System.out.println("sum = " + sum); // ������յ���ӽ��
	}
}

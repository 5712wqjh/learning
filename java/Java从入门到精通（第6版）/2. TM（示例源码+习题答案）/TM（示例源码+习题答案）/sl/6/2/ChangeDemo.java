
public class ChangeDemo {

	public static int[] exchange(int[] arr) {
		int tmp = arr[0];// �������ֱ���tmp�����������һ��Ԫ�ص�ֵ
		arr[0] = arr[1];// �ڶ���Ԫ��ֵ������һ��Ԫ��
		arr[1] = tmp;// �ڶ���Ԫ��ֵ��Ϊtmp
		return arr;
	}

	public static void main(String[] args) {
		int arr[] = { 17, 29 };
		System.out.println("��һ��ֵ=" + arr[0] + ",�ڶ���ֵ=" + arr[1]);
		arr = exchange(arr);
		System.out.println("��һ��ֵ=" + arr[0] + ",�ڶ���ֵ=" + arr[1]);
	}

}

import java.util.ArrayList;

interface SingleNumInterface {
	int[] getSingleNums(int max);
}

public class Demo {

	public static void main(String[] args) {
		SingleNumInterface sni = e -> {
			ArrayList<Integer> list = new ArrayList<>();
			if (e == 1) {
				return new int[] { 1 };
			}
			for (int i = 1; i <= e; i++) {
				boolean flag = true;// Ĭ��������
				for (int j = 2; j <= Math.sqrt(i); j++) {
					if (i % j == 0) {
						flag = false;// ������
					}
				}
				if (flag) {
					list.add(i);
				}
			}
			int result[] = new int[list.size()];
			for (int i = 0; i < result.length; i++) {
				result[i] = list.get(i);
			}
			return result;
		};

		int max = 99;
		System.out.println(max + "���ڵ���������Ϊ��");
		for (int num : sni.getSingleNums(max)) {
			System.out.print(num + " ");
		}

	}
}

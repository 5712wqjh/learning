
import java.util.function.Function;

public class FunctioinDemo {
	// ����Function�ӿڶ��󣬲���������Integer[]������ֵ������String
	Function<Integer[], String> function = (n) -> {
		StringBuilder str = new StringBuilder(); // �����ַ�����
		for (Integer num : n) { // ������������
			str.append(num); // �ַ������������Ԫ��
			str.append('.'); // �ַ���������ַ�'.'
		}
		str.deleteCharAt(str.length() - 1); // ɾ��ĩβ��'.'
		return str.toString(); // �����ַ���
	};

	public static void main(String[] args) {
		Integer[] ip = { 192, 168, 1, 1 }; // �����������
		FunctioinDemo demo = new FunctioinDemo();
		System.out.println(demo.function.apply(ip)); // ���������
	}
}

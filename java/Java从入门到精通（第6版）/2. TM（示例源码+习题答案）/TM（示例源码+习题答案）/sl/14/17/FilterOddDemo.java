
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterOddDemo {
	static void printeach(String message, List list) { // �������Ԫ��
		System.out.print(message); // ���������Ϣ
		// ʹ��forEach�����������ϲ���ӡԪ��
		list.stream().forEach(n -> {
			System.out.print(n + " ");
		});
		System.out.println(); // ����
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(); // ����������
		for (int i = 1; i <= 10; i++) { // ��1ѭ����10
			list.add(i); // �����ϸ�ֵ
		}
		printeach("����ԭ��Ԫ�أ�", list); // �������Ԫ��
		Stream<Integer> stream = list.stream(); // ��ȡ����������
		// �������е������������˳���,�ѹ��˽�����¸�ֵ��������
		stream = stream.filter(n -> n % 2 == 1);
		// �����������·�װ��һ��List����
		List<Integer> result = stream.collect(Collectors.toList());
		printeach("����֮��ļ���Ԫ�أ�", result); // �������Ԫ��
	}
}

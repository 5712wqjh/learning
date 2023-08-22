import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DistinctDemo {
	static void printeach(String message, List list) { // �������Ԫ��
		System.out.print(message); // ���������Ϣ
		// ʹ��forEach�����������ϲ���ӡԪ��
		list.stream().forEach(n -> {
			System.out.print(n + " ");
		});
		System.out.println();// ����
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(); // ��������
		list.add(1); // ���Ԫ��
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(3);
		printeach("ȥ��ǰ��", list); // ��ӡ����Ԫ��
		Stream<Integer> stream = list.stream(); // ��ȡ����������
		// ȡ�����е��ظ�Ԫ��
		stream = stream.distinct();
		// �����������·�װ��һ��List����
		List<Integer> reslut = stream.collect(Collectors.toList());
		printeach("ȥ�غ�", reslut); // ��ӡ����Ԫ��
	}
}

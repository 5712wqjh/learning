import java.util.List;
import java.util.stream.Stream;

public class CountDemo {

	public static void main(String[] args) {
		List<Employee> list = Employee.getEmpList(); // ��ȡ������Ĳ�������
		Stream<Employee> stream = list.stream(); // ��ȡ����������
		// �ж�Ա���Ƿ��е�������ڵ���40
		stream = stream.filter(e -> e.getSex().equals("��"));
		System.out.println("��Ա��������Ϊ��" + stream.count()); // ������
	}
}

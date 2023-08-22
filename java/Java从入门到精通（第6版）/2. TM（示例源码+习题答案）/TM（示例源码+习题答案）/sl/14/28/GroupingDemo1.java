
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingDemo1 {
	public static void main(String[] args) {
		List<Employee> list = Employee.getEmpList(); // ��ȡ������Ĳ�������
		Stream<Employee> stream = list.stream(); // ��ȡ����������
		// ������򷽷�������Ա�����Ž��зּ�
		Function<Employee, String> f = Employee::getDept;
		// ���ղ��ŷֳ�����List���ϣ������б���Ա�����󣬷��س�Map
		Map<String, List<Employee>> map = stream.collect(Collectors.groupingBy(f));
		Set<String> keySet = map.keySet(); // ��ȡMap���е����в�������
		for (String deptName : keySet) { // �����������Ƽ���
			// �����������
			System.out.println("��" + deptName + "�� ���ŵ�Ա���б����£�");
			List<Employee> deptList = map.get(deptName); // ��ȡ�������ƶ�Ӧ��Ա������
			for (Employee emp : deptList) { // ����Ա������
				System.out.println("    " + emp); // ���Ա����Ϣ
			}
		}
	}
}

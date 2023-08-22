
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingDemo2 {
	public static void main(String[] args) {
		List<Employee> list = Employee.getEmpList(); // ��ȡ������Ĳ�������
		Stream<Employee> stream = list.stream(); // ��ȡ����������
		// һ��������򷽷�������Ա�����Ž��зּ�
		Function<Employee, String> deptFunc = Employee::getDept;
		// ����������򷽷�������Ա�����Ž��зּ�
		Function<Employee, String> sexFunc = Employee::getSex;
		// �����е����ݽ��ж������飬�ȶ�Ա�����ֽ��з��飬�ڶ�Ա���Ա���з���
		Map<String, Map<String, List<Employee>>> map = stream
				.collect(Collectors.groupingBy(deptFunc, Collectors.groupingBy(sexFunc)));
		// ��ȡMap���е�һ����������ϣ�Ҳ���ǲ������Ƽ���
		Set<String> deptSet = map.keySet();
		for (String deptName : deptSet) { // �����������Ƽ���
			// �����������
			System.out.println("��" + deptName + "�� ���ŵ�Ա���б����£�");
			// ��ȡ���Ŷ�Ӧ�Ķ��������Map����
			Map<String, List<Employee>> sexMap = map.get(deptName);
			// ��ö�������ļ����ϣ�Ҳ�����Ա𼯺�
			Set<String> sexSet = sexMap.keySet();
			for (String sexName : sexSet) { // ���������Ա𼯺�
				// ��ȡ�Ա��Ӧ��Ա������
				List<Employee> emplist = sexMap.get(sexName);
				System.out.println("    ��" + sexName + "�� Ա����"); // ����Ա�����
				for (Employee emp : emplist) {// ����Ա������
					System.out.println("        " + emp); // �����ӦԱ����Ϣ
				}
			}
		}
	}
}

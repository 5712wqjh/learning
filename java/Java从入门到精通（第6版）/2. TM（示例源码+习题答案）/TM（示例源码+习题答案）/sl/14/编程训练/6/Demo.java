import java.util.List;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {
		List<Employee> list = Employee.getEmpList(); // ��ȡ������Ĳ�������
		Stream<Employee> stream = list.stream(); // ��ȡ����������
		stream = stream.filter(e -> e.getSex().equals("Ů")).filter(e -> e.getSalary() > 5000);
		stream.forEach(e -> {
			System.out.println(e);
		});
	}
}

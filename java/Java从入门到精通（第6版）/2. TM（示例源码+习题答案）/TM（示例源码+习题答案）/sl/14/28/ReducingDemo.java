
import java.util.Comparator; // �Ƚ����ӿ�
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ReducingDemo {
	public static void main(String[] args) {
		List<Employee> list = Employee.getEmpList(); // ��ȡ��������

		long count = list.stream().count(); // ��ȡ������
		// ���д���Ҳ��ʵ�ֻ�ȡ������Ч��
		// count = stream.collect(Collectors.counting());
		System.out.println("��˾������Ϊ��" + count);

		// ͨ��Comparator�ȽϽӿڣ��Ƚ�Ա������,��ͨ��Collectors��maxBy()����ȡ����������Ա����Optional����
		Optional<Employee> ageMax = list.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getAge)));
		Employee older = ageMax.get();// ��ȡԱ������
		System.out.println("��˾��������Ա���ǣ�\n    " + older);

		// ͨ��Comparator�ȽϽӿڣ��Ƚ�Ա������,��ͨ��Collectors��minBy()����ȡ��������С��Ա����Optional����
		Optional<Employee> ageMin = list.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getAge)));
		Employee younger = ageMin.get();// ��ȡԱ������
		System.out.println("��˾������С��Ա���ǣ�\n    " + younger);

		// ͳ�ƹ�˾Ա��н���ܺ�
		double salarySum = list.stream().collect(Collectors.summingDouble(Employee::getSalary));
		System.out.println("��˾��н���ܺ�Ϊ��" + salarySum); // ������

		// ͳ�ƹ�˾н��ƽ����
		double salaryAvg = list.stream().collect(Collectors.averagingDouble(Employee::getSalary));
		// ʹ�ø�ʽ�����������2λС��
		System.out.printf("��˾��ƽ��н��Ϊ��%.2f\n", salaryAvg);

		// ����ͳ�ƶ�������summarizingDouble()������ȡԱ��н�ʸ������ͳ������
		java.util.DoubleSummaryStatistics s = list.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
		System.out.print("ͳ�ƣ���н�ʵ�����=" + s.getCount() + ", ");
		System.out.print("н������=" + s.getSum() + ", ");
		System.out.print("ƽ��н��=" + s.getAverage() + ", ");
		System.out.print("���н��=" + s.getMax() + ", ");
		System.out.print("��Сн��=" + s.getMin() + "\n");

		// ����˾Ա������ƴ��һ���ַ������ö��ŷָ�
		String nameList = list.stream().map(Employee::getName).collect(Collectors.joining(", "));
		System.out.println("��˾Ա���������£�\n    " + nameList);
	}
}

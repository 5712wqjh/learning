
import java.util.Comparator; // 比较器接口
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ReducingDemo {
	public static void main(String[] args) {
		List<Employee> list = Employee.getEmpList(); // 获取测试数据

		long count = list.stream().count(); // 获取总人数
		// 下行代码也能实现获取总人数效果
		// count = stream.collect(Collectors.counting());
		System.out.println("公司总人数为：" + count);

		// 通过Comparator比较接口，比较员工年龄,再通过Collectors的maxBy()方法取出年龄最大的员工的Optional对象
		Optional<Employee> ageMax = list.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getAge)));
		Employee older = ageMax.get();// 获取员工对象
		System.out.println("公司年龄最大的员工是：\n    " + older);

		// 通过Comparator比较接口，比较员工年龄,再通过Collectors的minBy()方法取出年龄最小的员工的Optional对象
		Optional<Employee> ageMin = list.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getAge)));
		Employee younger = ageMin.get();// 获取员工对象
		System.out.println("公司年龄最小的员工是：\n    " + younger);

		// 统计公司员工薪资总和
		double salarySum = list.stream().collect(Collectors.summingDouble(Employee::getSalary));
		System.out.println("公司的薪资总和为：" + salarySum); // 输出结果

		// 统计公司薪资平均数
		double salaryAvg = list.stream().collect(Collectors.averagingDouble(Employee::getSalary));
		// 使用格式化输出，保留2位小数
		System.out.printf("公司的平均薪资为：%.2f\n", salaryAvg);

		// 创建统计对象，利用summarizingDouble()方法获取员工薪资各方面的统计数据
		java.util.DoubleSummaryStatistics s = list.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
		System.out.print("统计：拿薪资的人数=" + s.getCount() + ", ");
		System.out.print("薪资总数=" + s.getSum() + ", ");
		System.out.print("平均薪资=" + s.getAverage() + ", ");
		System.out.print("最大薪资=" + s.getMax() + ", ");
		System.out.print("最小薪资=" + s.getMin() + "\n");

		// 将公司员工姓名拼成一个字符串，用逗号分隔
		String nameList = list.stream().map(Employee::getName).collect(Collectors.joining(", "));
		System.out.println("公司员工名单如下：\n    " + nameList);
	}
}

import java.util.List;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {
		List<Employee> list = Employee.getEmpList(); // 获取公共类的测试数据
		Stream<Employee> stream = list.stream(); // 获取集合流对象
		stream = stream.filter(e -> e.getSex().equals("女")).filter(e -> e.getSalary() > 5000);
		stream.forEach(e -> {
			System.out.println(e);
		});
	}
}

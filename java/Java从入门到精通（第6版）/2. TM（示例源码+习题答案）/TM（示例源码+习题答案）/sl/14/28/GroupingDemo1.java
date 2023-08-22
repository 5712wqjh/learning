
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingDemo1 {
	public static void main(String[] args) {
		List<Employee> list = Employee.getEmpList(); // 获取公共类的测试数据
		Stream<Employee> stream = list.stream(); // 获取集合流对象
		// 分组规则方法，按照员工部门进行分级
		Function<Employee, String> f = Employee::getDept;
		// 按照部门分成若干List集合，集合中保存员工对象，返回成Map
		Map<String, List<Employee>> map = stream.collect(Collectors.groupingBy(f));
		Set<String> keySet = map.keySet(); // 获取Map的中的所有部门名称
		for (String deptName : keySet) { // 遍历部门名称集合
			// 输出部门名称
			System.out.println("【" + deptName + "】 部门的员工列表如下：");
			List<Employee> deptList = map.get(deptName); // 获取部门名称对应的员工集合
			for (Employee emp : deptList) { // 遍历员工集合
				System.out.println("    " + emp); // 输出员工信息
			}
		}
	}
}

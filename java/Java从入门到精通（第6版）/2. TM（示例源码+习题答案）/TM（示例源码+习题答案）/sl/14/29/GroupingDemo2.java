
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingDemo2 {
	public static void main(String[] args) {
		List<Employee> list = Employee.getEmpList(); // 获取公共类的测试数据
		Stream<Employee> stream = list.stream(); // 获取集合流对象
		// 一级分组规则方法，按照员工部门进行分级
		Function<Employee, String> deptFunc = Employee::getDept;
		// 二级分组规则方法，按照员工部门进行分级
		Function<Employee, String> sexFunc = Employee::getSex;
		// 将流中的数据进行二级分组，先对员工部分进行分组，在对员工性别进行分组
		Map<String, Map<String, List<Employee>>> map = stream
				.collect(Collectors.groupingBy(deptFunc, Collectors.groupingBy(sexFunc)));
		// 获取Map的中的一级分组键集合，也就是部门名称集合
		Set<String> deptSet = map.keySet();
		for (String deptName : deptSet) { // 遍历部门名称集合
			// 输出部门名称
			System.out.println("【" + deptName + "】 部门的员工列表如下：");
			// 获取部门对应的二级分组的Map对象
			Map<String, List<Employee>> sexMap = map.get(deptName);
			// 获得二级分组的键集合，也就是性别集合
			Set<String> sexSet = sexMap.keySet();
			for (String sexName : sexSet) { // 遍历部门性别集合
				// 获取性别对应的员工集合
				List<Employee> emplist = sexMap.get(sexName);
				System.out.println("    【" + sexName + "】 员工："); // 输出性别种类
				for (Employee emp : emplist) {// 遍历员工集合
					System.out.println("        " + emp); // 输出对应员工信息
				}
			}
		}
	}
}

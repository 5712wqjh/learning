import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapDemo {
    public static void main(String[] args) {
        List<Employee> list = Employee.getEmpList();          // 获取公共类的测试数据
        Stream<Employee> stream = list.stream();              // 获取集合流对象
        // 将所有开发部的员工过滤出来
        stream = stream.filter(people -> "开发部".equals(people.getDept()));
        // 将所有员工的名字映射成一个新的流对象
        Stream<String> names = stream.map(Employee::getName);
        // 将流对象重新封装成一个List集合
        List<String> result = names.collect(Collectors.toList());
        for (String emp : result) {                              // 遍历结果集
            System.out.println(emp);                             // 输出所有姓名
        }
    }
}

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SkipDemo {
    public static void main(String[] args) {
        List<Employee> list = Employee.getEmpList();    // 获取公共类的测试数据   
        Stream<Employee> stream = list.stream();        // 获取集合流对象
        // 将所有男员工过滤出来
        stream = stream.filter(people -> "男".equals(people.getSex()));
        // 跳过前两位
        stream = stream.skip(2);
        // 将流对象重新封装成一个List集合
        List<Employee> result = stream.collect(Collectors.toList());
        for (Employee emp : result) {                    // 遍历结果集
            System.out.println(emp);                     // 输出员工对象信息
        }
    }
}

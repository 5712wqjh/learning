import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilerDemo {
    public static void main(String[] args) {
        List<Employee> list = Employee.getEmpList();           // 获取公共类的测试数据
        Stream<Employee> stream = list.stream();               // 获取集合流对象
        // 将年龄大于30岁的员工过滤出来
        stream = stream.filter(people -> people.getAge() > 30);
        // 将流对象重新封装成一个List集合
        List<Employee> result = stream.collect(Collectors.toList());
        for (Employee emp : result) {                          // 遍历结果集
            System.out.println(emp);                           // 输出员工对象信息
        }
    }
}

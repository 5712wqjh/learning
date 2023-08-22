import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
public class FindFirstDemo {
    public static void main(String[] args) {
        // 获取公共类的测试数据
        List<Employee> list = Employee.getEmpList();
        Stream<Employee> stream = list.stream();             // 获取集合流对象
        // 过滤出21岁的员工
        stream = stream.filter(people -> people.getAge() == 21);
        Optional<Employee> young = stream.findFirst();      // 获取第一个元素
        Employee emp = young.get();                           // 获取员工对象
        System.out.println(emp);                              // 输出结果
    }
}

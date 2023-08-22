
import java.util.List;
import java.util.stream.Stream;
public class AnyMatchDemo {
    public static void main(String[] args) {
        List<Employee> list = Employee.getEmpList();     // 获取公共类的测试数据
        Stream<Employee> stream = list.stream();         // 获取集合流对象
        // 判断员工是否有的年龄大于等于40
        boolean result = stream.anyMatch(people -> people.getAge() >= 40);
        System.out.println("员工中有年龄在40或以上的吗？：" + result); // 输出结果

    }
}

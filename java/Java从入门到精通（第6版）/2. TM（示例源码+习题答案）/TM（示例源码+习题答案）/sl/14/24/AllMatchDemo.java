import java.util.List;
import java.util.stream.Stream;

public class AllMatchDemo {
    public static void main(String[] args) {
        List<Employee> list = Employee.getEmpList();       // 获取公共类的测试数据
        Stream<Employee> stream = list.stream();           // 获取集合流对象
        // 判断所有员工的年龄是否都大于25
        boolean result = stream.allMatch(people -> people.getAge() > 25);
        System.out.println("所有员工是否都大于25岁：" + result);  // 输出结果
    }
}

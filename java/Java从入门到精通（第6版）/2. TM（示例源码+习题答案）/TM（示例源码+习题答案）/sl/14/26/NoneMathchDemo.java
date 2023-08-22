import java.util.List;
import java.util.stream.Stream;
public class NoneMathchDemo {
    public static void main(String[] args) {
        List<Employee> list = Employee.getEmpList();        // 获取公共类的测试数据
        Stream<Employee> stream = list.stream();            // 获取集合流对象
        // 判断公司中是否不存在薪资小于2000的员工？
        boolean result = stream.noneMatch(people -> people.getSalary() <2000 );
        System.out.println("公司中是否不存在薪资小于2000元的员工？：" + result);// 输出结果
    }
}

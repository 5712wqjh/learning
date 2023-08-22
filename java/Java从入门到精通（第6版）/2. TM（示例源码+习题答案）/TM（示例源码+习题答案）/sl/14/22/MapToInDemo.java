import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;
public class MapToInDemo {
    public static void main(String[] args) {
       List<Employee> list = Employee.getEmpList();      // 获取公共类的测试数据
       Stream<Employee> stream = list.stream();          // 获取集合流对象
       // 将所有开发部的员工过滤出来
       stream = stream.filter(people -> "销售部".equals(people.getDept()));
       // 将所有员工的名字映射成一个新的流对象
       DoubleStream salarys = stream.mapToDouble(Employee::getSalary);
       // 统计流中元素的数学总和
       double sum = salarys.sum();
       System.out.println("销售部一个月的薪资总额："+sum);
    }
}

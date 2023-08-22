import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
public class FindFirstDemo {
    public static void main(String[] args) {
        // ��ȡ������Ĳ�������
        List<Employee> list = Employee.getEmpList();
        Stream<Employee> stream = list.stream();             // ��ȡ����������
        // ���˳�21���Ա��
        stream = stream.filter(people -> people.getAge() == 21);
        Optional<Employee> young = stream.findFirst();      // ��ȡ��һ��Ԫ��
        Employee emp = young.get();                           // ��ȡԱ������
        System.out.println(emp);                              // ������
    }
}

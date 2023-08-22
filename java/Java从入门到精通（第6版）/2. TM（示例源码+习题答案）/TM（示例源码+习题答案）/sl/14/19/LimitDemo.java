import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class LimitDemo {
    public static void main(String[] args) {
        List<Employee> list = Employee.getEmpList();      // ��ȡ������Ĳ�������
        Stream<Employee> stream = list.stream();          // ��ȡ����������
        // ������ŮԱ�����˳���
        stream = stream.filter(people -> "Ů".equals(people.getSex()));
        // ȡ��ǰ��λ
        stream = stream.limit(2);
        // �����������·�װ��һ��List����
        List<Employee> result = stream.collect(Collectors.toList());
        for (Employee emp : result) {                     // ���������
            System.out.println(emp);                      // ���Ա��������Ϣ
        }
    }
}

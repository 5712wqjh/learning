import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilerDemo {
    public static void main(String[] args) {
        List<Employee> list = Employee.getEmpList();           // ��ȡ������Ĳ�������
        Stream<Employee> stream = list.stream();               // ��ȡ����������
        // ���������30���Ա�����˳���
        stream = stream.filter(people -> people.getAge() > 30);
        // �����������·�װ��һ��List����
        List<Employee> result = stream.collect(Collectors.toList());
        for (Employee emp : result) {                          // ���������
            System.out.println(emp);                           // ���Ա��������Ϣ
        }
    }
}

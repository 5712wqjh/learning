import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapDemo {
    public static void main(String[] args) {
        List<Employee> list = Employee.getEmpList();          // ��ȡ������Ĳ�������
        Stream<Employee> stream = list.stream();              // ��ȡ����������
        // �����п�������Ա�����˳���
        stream = stream.filter(people -> "������".equals(people.getDept()));
        // ������Ա��������ӳ���һ���µ�������
        Stream<String> names = stream.map(Employee::getName);
        // �����������·�װ��һ��List����
        List<String> result = names.collect(Collectors.toList());
        for (String emp : result) {                              // ���������
            System.out.println(emp);                             // �����������
        }
    }
}

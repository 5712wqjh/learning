import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SkipDemo {
    public static void main(String[] args) {
        List<Employee> list = Employee.getEmpList();    // ��ȡ������Ĳ�������   
        Stream<Employee> stream = list.stream();        // ��ȡ����������
        // ��������Ա�����˳���
        stream = stream.filter(people -> "��".equals(people.getSex()));
        // ����ǰ��λ
        stream = stream.skip(2);
        // �����������·�װ��һ��List����
        List<Employee> result = stream.collect(Collectors.toList());
        for (Employee emp : result) {                    // ���������
            System.out.println(emp);                     // ���Ա��������Ϣ
        }
    }
}

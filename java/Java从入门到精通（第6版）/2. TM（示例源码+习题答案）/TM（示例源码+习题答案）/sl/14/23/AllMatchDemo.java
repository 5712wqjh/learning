import java.util.List;
import java.util.stream.Stream;

public class AllMatchDemo {
    public static void main(String[] args) {
        List<Employee> list = Employee.getEmpList();       // ��ȡ������Ĳ�������
        Stream<Employee> stream = list.stream();           // ��ȡ����������
        // �ж�����Ա���������Ƿ񶼴���25
        boolean result = stream.allMatch(people -> people.getAge() > 25);
        System.out.println("����Ա���Ƿ񶼴���25�꣺" + result);  // ������
    }
}

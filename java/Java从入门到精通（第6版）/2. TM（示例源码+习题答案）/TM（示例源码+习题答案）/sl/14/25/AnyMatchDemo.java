
import java.util.List;
import java.util.stream.Stream;
public class AnyMatchDemo {
    public static void main(String[] args) {
        List<Employee> list = Employee.getEmpList();     // ��ȡ������Ĳ�������
        Stream<Employee> stream = list.stream();         // ��ȡ����������
        // �ж�Ա���Ƿ��е�������ڵ���40
        boolean result = stream.anyMatch(people -> people.getAge() >= 40);
        System.out.println("Ա������������40�����ϵ��𣿣�" + result); // ������

    }
}

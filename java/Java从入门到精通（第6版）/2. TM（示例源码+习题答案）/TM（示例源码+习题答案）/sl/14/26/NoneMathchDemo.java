import java.util.List;
import java.util.stream.Stream;
public class NoneMathchDemo {
    public static void main(String[] args) {
        List<Employee> list = Employee.getEmpList();        // ��ȡ������Ĳ�������
        Stream<Employee> stream = list.stream();            // ��ȡ����������
        // �жϹ�˾���Ƿ񲻴���н��С��2000��Ա����
        boolean result = stream.noneMatch(people -> people.getSalary() <2000 );
        System.out.println("��˾���Ƿ񲻴���н��С��2000Ԫ��Ա������" + result);// ������
    }
}

import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;
public class MapToInDemo {
    public static void main(String[] args) {
       List<Employee> list = Employee.getEmpList();      // ��ȡ������Ĳ�������
       Stream<Employee> stream = list.stream();          // ��ȡ����������
       // �����п�������Ա�����˳���
       stream = stream.filter(people -> "���۲�".equals(people.getDept()));
       // ������Ա��������ӳ���һ���µ�������
       DoubleStream salarys = stream.mapToDouble(Employee::getSalary);
       // ͳ������Ԫ�ص���ѧ�ܺ�
       double sum = salarys.sum();
       System.out.println("���۲�һ���µ�н���ܶ"+sum);
    }
}

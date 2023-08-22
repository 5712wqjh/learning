import java.util.ArrayList;
import java.util.List;

public class Employee { // Ա����
	private String name; // ����
	private int age; // ����
	private double salary; // ����
	private String sex; // �Ա�
	private String dept; // ����

	// ���췽��
	public Employee(String name, int age, double salary, String sex, String dept) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.sex = sex;
		this.dept = dept;
	}

	// ��д�˷����������ӡ���Ա����Ϣ
	public String toString() {
		return "name=" + name + ", age=" + age + ", salary=" + salary + ", sex=" + sex + ", dept=" + dept;
	}

	// ������Ա�����Ե�getter����
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getSalary() {
		return salary;
	}

	public String getSex() {
		return sex;
	}

	public String getDept() {
		return dept;
	}

	static List<Employee> getEmpList() { // �ṩ���ݳ�ʼ������
		List<Employee> list = new ArrayList<Employee>();
		// ���Ա������
		list.add(new Employee("����", 40, 9000, "��", "��Ӫ��"));
		list.add(new Employee("С��", 24, 5000, "Ů", "������"));
		list.add(new Employee("���", 32, 7500, "��", "���۲�"));
		list.add(new Employee("�仨", 28, 5500, "Ů", "���۲�"));
		list.add(new Employee("С��", 21, 3000, "��", "������"));
		list.add(new Employee("����", 35, 6000, "Ů", "���²�"));
		list.add(new Employee("С��", 21, 3000, "Ů", "���²�"));
		return list;
	}
}

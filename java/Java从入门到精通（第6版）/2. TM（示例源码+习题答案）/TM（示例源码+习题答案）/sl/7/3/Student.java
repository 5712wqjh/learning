
public class Student {
	String name;
	int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "�ҽ�" + name + "������" + age + "�ꡣ";
	}

	public static void main(String[] args) {
		Student s1 = new Student("����", 16);
		System.out.println(s1);
		Student s2 = new Student("����", 19);
		System.out.println(s2);
	}
}

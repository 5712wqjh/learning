
class People {
	public void work() {
		System.out.println("ÿ���˶�Ҫ����");
	}
}

class Teacher extends People {
	@Override
	public void work() {
		System.out.println("��ʦҪ�����ڿ�");
	}
}

class Student extends People {
	@Override
	public void work() {
		System.out.println("ѧ��Ҫ�ú�ѧϰ");
	}
}

public class Demo {
	public static void main(String[] args) {
		People people = new People();
		people.work();
		People teacher = new Teacher();
		teacher.work();
		People student = new Student();
		student.work();
	}
}

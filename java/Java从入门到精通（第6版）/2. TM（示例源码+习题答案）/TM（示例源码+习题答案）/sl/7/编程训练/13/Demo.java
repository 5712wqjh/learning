
class People {
	public void work() {
		System.out.println("每个人都要工作");
	}
}

class Teacher extends People {
	@Override
	public void work() {
		System.out.println("教师要认真授课");
	}
}

class Student extends People {
	@Override
	public void work() {
		System.out.println("学生要好好学习");
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

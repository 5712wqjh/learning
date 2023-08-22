
public class Scottare {
	public static void main(String[] args) {
		int salaryA = 4500;
		int salaryB = 5500;
		int standard = 5000;
		System.out.println("员工a的月薪为4500元，员工a是否需要缴税：" + (standard < salaryA));
		System.out.println("员工b的月薪为5500元，员工b是否需要缴税：" + (standard < salaryB));
	}
}

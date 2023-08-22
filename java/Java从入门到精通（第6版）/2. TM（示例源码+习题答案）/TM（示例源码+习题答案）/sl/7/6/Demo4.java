class Bird { }

class Pigeon extends Bird { }

public class Demo4 {
	public static void main(String[] args) {
		Bird bird = new Pigeon();		// 某只鸽子是一只鸟
		Pigeon pigeon = bird;		// 某只鸟是一只鸽子
	}
}

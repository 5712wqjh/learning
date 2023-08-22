
enum SeasonEnum { // 四季枚举
	SPRING, SUMMER, AUTUMN, WINTER
}

public class ShowEnum {
	public static void main(String[] args) {
		SeasonEnum es[] = SeasonEnum.values();
		for (int i = 0; i < es.length; i++) {
			System.out.println("枚举常量：" + es[i]);
		}
	}
}

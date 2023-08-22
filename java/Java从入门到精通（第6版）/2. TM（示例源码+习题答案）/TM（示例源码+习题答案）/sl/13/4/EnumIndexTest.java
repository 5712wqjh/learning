
enum SeasonEnum { // 四季枚举
	SPRING, SUMMER, AUTUMN, WINTER
}

public class EnumIndexTest {
	public static void main(String[] args) {
		SeasonEnum es[] = SeasonEnum.values();
		for (int i = 0; i < es.length; i++) {
			System.out.println(es[i] + "在枚举类型中位置索引值" + es[i].ordinal());
		}
	}
}

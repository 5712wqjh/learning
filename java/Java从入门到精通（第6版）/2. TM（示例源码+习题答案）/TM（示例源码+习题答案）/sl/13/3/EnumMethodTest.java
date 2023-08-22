enum SeasonEnum { // 四季枚举
	SPRING, SUMMER, AUTUMN, WINTER
}

public class EnumMethodTest {
	public static void main(String[] args) {
		SeasonEnum tmp = SeasonEnum.valueOf("SUMMER");// 根据字符串创建一个枚举值
		SeasonEnum es[] = SeasonEnum.values();// 获取所有枚举值
		for (int i = 0; i < es.length; i++) {
			String message = "";// 待输出的消息
			int result = tmp.compareTo(es[i]);// 记录两个枚举的比较结果
			if (result < 0) {
				message = tmp + "在" + es[i] + "的前个" + (-result) + "位置";
			} else if (result > 0) {
				message = tmp + "与" + es[i] + "的后个" + result + "位置";
			} else if (result == 0) {
				message = tmp + "与" + es[i] + "是同一个值";
			}
			System.out.println(message);
		}
	}
}

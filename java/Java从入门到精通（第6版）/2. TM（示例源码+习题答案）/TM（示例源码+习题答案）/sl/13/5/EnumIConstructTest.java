
enum SeasonEnum { // 四季枚举
	SPRING("万物复苏"), SUMMER("烈日炎炎"), AUTUMN("秋草枯黄"), WINTER("白雪皑皑");

	private String remarks;// 枚举的备注

	private SeasonEnum(String remarks) {// 构造方法
		this.remarks = "我是" + this.toString() + ",我来之后" + remarks + "。";
	}

	public String getRemarks() {// 获取备注值
		return remarks;
	}
}

public class EnumIConstructTest {
	public static void main(String[] args) {
		SeasonEnum es[] = SeasonEnum.values();
		for (int i = 0; i < es.length; i++) {
			System.out.println(es[i].getRemarks());
		}
	}
}

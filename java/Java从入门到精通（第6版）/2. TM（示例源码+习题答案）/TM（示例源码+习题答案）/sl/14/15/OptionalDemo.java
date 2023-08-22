import java.util.Optional;

public class OptionalDemo {
	public static void main(String[] args) {
		Optional<String> strValue = Optional.of("Hello"); // 创建有值对象
		boolean haveValueFlag = strValue.isPresent(); // 判断对象中的值是不是空的
		System.out.println("strValue对象是否有值：" + haveValueFlag);
		if (haveValueFlag) { // 如果不是空的
			String str = strValue.get(); // 获取对象中值
			System.out.println("strValue对象的值是：" + str);
		}

		Optional<String> noValue = Optional.empty(); // 创建空值对象
		boolean noValueFlag = noValue.isPresent(); // 判断对象中的值是不是空的
		System.out.println("noValue对象是否有值：" + noValueFlag);
		if (noValueFlag) { // 如果不是空的
			String str = noValue.get(); // 获取对象中值
			System.out.println("noValue对象的值是：" + str);
		} else { // 如果是空的
			String str = noValue.orElse("使用默认值"); // 使用默认值
			System.out.println("noValue对象的值是：" + str);
		}
	}
}

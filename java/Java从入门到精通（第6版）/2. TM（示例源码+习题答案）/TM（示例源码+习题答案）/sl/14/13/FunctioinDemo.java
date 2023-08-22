
import java.util.function.Function;

public class FunctioinDemo {
	// 创建Function接口对象，参数类型是Integer[]，返回值类型是String
	Function<Integer[], String> function = (n) -> {
		StringBuilder str = new StringBuilder(); // 创建字符序列
		for (Integer num : n) { // 遍历参数数组
			str.append(num); // 字符序列添加数组元素
			str.append('.'); // 字符序列添加字符'.'
		}
		str.deleteCharAt(str.length() - 1); // 删除末尾的'.'
		return str.toString(); // 返回字符串
	};

	public static void main(String[] args) {
		Integer[] ip = { 192, 168, 1, 1 }; // 待处理的数组
		FunctioinDemo demo = new FunctioinDemo();
		System.out.println(demo.function.apply(ip)); // 输出处理结果
	}
}

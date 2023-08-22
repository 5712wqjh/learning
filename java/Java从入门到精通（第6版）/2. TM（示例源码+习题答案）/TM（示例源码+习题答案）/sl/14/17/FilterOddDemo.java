
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterOddDemo {
	static void printeach(String message, List list) { // 输出集合元素
		System.out.print(message); // 输出文字信息
		// 使用forEach方法遍历集合并打印元素
		list.stream().forEach(n -> {
			System.out.print(n + " ");
		});
		System.out.println(); // 换行
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(); // 创建空数组
		for (int i = 1; i <= 10; i++) { // 从1循环到10
			list.add(i); // 给集合赋值
		}
		printeach("集合原有元素：", list); // 输出集合元素
		Stream<Integer> stream = list.stream(); // 获取集合流对象
		// 将集合中的所有奇数过滤出来,把过滤结果重新赋值给流对象
		stream = stream.filter(n -> n % 2 == 1);
		// 将流对象重新封装成一个List集合
		List<Integer> result = stream.collect(Collectors.toList());
		printeach("过滤之后的集合元素：", result); // 输出集合元素
	}
}

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DistinctDemo {
	static void printeach(String message, List list) { // 输出集合元素
		System.out.print(message); // 输出文字信息
		// 使用forEach方法遍历集合并打印元素
		list.stream().forEach(n -> {
			System.out.print(n + " ");
		});
		System.out.println();// 换行
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(); // 创建集合
		list.add(1); // 添加元素
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(3);
		printeach("去重前：", list); // 打印集合元素
		Stream<Integer> stream = list.stream(); // 获取集合流对象
		// 取出流中的重复元素
		stream = stream.distinct();
		// 将流对象重新封装成一个List集合
		List<Integer> reslut = stream.collect(Collectors.toList());
		printeach("去重后：", reslut); // 打印集合元素
	}
}

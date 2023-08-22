
import java.util.ArrayList;
import java.util.List;

public class Books { // 创建一个Books类
	public static void main(String[] args) {
		List<String> shelf = new ArrayList<>(); // 使用ArrayList实现List接口
		// 使用add()方法向集合shelf中添加元素
		shelf.add("《三国演义》");
		shelf.add("《莎士比亚诗选》");
		shelf.add("《红楼梦》");
		System.out.println("书架上的书籍：" + shelf); // 输出集合shelf中的元素
		List<String> desk = new ArrayList<>(); // 使用LinkedList实现List接口
		// 使用add()方法向集合desk中添加元素
		desk.add("《西游记》");
		desk.add("《水浒传》");
		System.out.println("书桌上的书籍：" + desk); // 输出集合desk中的元素
		System.out.println("\n现在开始整理四大名著……\n"); // 提示信息
		shelf.add(0, desk.get(1)); // 在集合shelf索引为0的位置上，添加集合desk中索引为1的元素
		shelf.set(2, desk.get(0)); // 把集合shelf索引为2的元素更改为集合desk中索引为0的元素
		System.out.print("中国的四大名著分别是："); // 提示信息
		for (int i = 0; i < shelf.size(); i++) {
			System.out.print(shelf.get(i) + "　"); // 输出集合shelf中的元素
		}
	}
}

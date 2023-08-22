import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest { // 创建TreeSetTest类
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>(); // 使用 TreeSet创建Set集合对象
		// 向Set集合中添加元素
		set.add(-5);
		set.add(-7);
		set.add(10);
		set.add(6);
		set.add(3);
		// 创建Iterator迭代器对象
		Iterator<Integer> it = set.iterator();
		System.out.print("Set集合中的元素："); // 提示信息
		// 遍历并输出Set集合中的元素
		while (it.hasNext()) {
			System.out.print(it.next() + "　");
		}
	}
}
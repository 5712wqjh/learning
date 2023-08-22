import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>(); // 创建Map集合对象
		map.put("ISBN-978654", "Java从入门到精通"); // 向Map集合中添加元素
		map.put("ISBN-978361", "Android从入门到精通");
		map.put("ISBN-978893", "21天学Android");
		map.put("ISBN-978756", "21天学Java");
		Set<String> set = map.keySet(); // 构建Map集合中所有key的Set集合
		Iterator<String> it = set.iterator(); // 创建Iterator迭代器
		System.out.println("key值：");
		while (it.hasNext()) { // 遍历并输出Map集合中的key值
			System.out.print(it.next() + "　");
		}
		Collection<String> coll = map.values(); // 构建Map集合中所有value值的集合
		it = coll.iterator();
		System.out.println("\nvalue值：");
		while (it.hasNext()) { // 遍历并输出Map集合中的value值
			System.out.print(it.next() + "　");
		}
	}
}

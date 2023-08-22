
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AnyClass {
	public static void main(String[] args) {
		// 定义ArrayList容器，设置容器内的值类型为Integer
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1); // 为容器添加新值
		for (int i = 0; i < a.size(); i++) {
			// 根据容器的长度，循环显示容器内的值
			System.out.println("获取ArrayList容器的值：" + a.get(i));
		}
		// 定义HashMap容器，设置容器的键名与键值类型分别为Integer与String型
		Map<Integer, String> m = new HashMap<Integer, String>();
		for (int i = 0; i < 5; i++) {
			m.put(i, "成员" + i); // 为容器填充键名与键值
		}
		for (int i = 0; i < m.size(); i++) {
			// 根据键名获取键值
			System.out.println("获取Map容器的值" + m.get(i));
		}
	}
}

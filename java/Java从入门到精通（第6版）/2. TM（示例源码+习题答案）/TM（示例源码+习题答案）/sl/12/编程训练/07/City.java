
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class City { // 创建一个City（城市）类
	public static void main(String[] args) {
		Map<String, String[]> map = new HashMap<>(); // 使用HashMap实现Map接口
		// 使用put()方法向集合map中添加元素
		map.put("黑龙江",
				new String[] { "哈尔滨", "齐齐哈尔", "牡丹江", "大庆", "伊春", "双鸭山", "鹤岗", "鸡西", "佳木斯", "七台河", "黑河", "绥化", "大兴安岭" });
		map.put("吉林", new String[] { "长春", "延边", "吉林", "白山", "白城", "四平", "松原", "辽源", "大安", "通化" });
		map.put("沈阳",
				new String[] { "沈阳", "大连", "葫芦岛", "旅顺", "本溪", "抚顺", "铁岭", "辽阳", "营口", "阜新", "朝阳", "锦州", "丹东", "鞍山" });
		Iterator<String> iter = map.keySet().iterator(); // 创建迭代器
		while (iter.hasNext()) { // 判断集合map中是否有内容
			Object province = iter.next(); // 接收key值
			System.out.println(province + "省主要城市："); // 输出key值
			String val[] = (String[]) map.get(province); // 接收Value值，并存放到String类型的数组中
			for (int i = 0; i < val.length; i++) { // 遍历数组
				System.out.print(val[i] + "　"); // 输出数组中的元素
			}
			System.out.println("\n"); // 换行
		}
	}
}

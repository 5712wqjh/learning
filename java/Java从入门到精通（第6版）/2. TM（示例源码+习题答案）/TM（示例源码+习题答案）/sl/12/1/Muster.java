import java.util.*; //导入java.util包，其他实例都要添加该语句

public class Muster { // 创建类Muster
	public static void main(String args[]) {
		Collection<String> list = new ArrayList<>(); // 实例化集合类对象
		list.add("《Java从入门到精通》"); // 向集合添加数据
		list.add("《零基础学Java》");
		list.add("《Java精彩编程200例》");
		Iterator<String> it = list.iterator(); // 创建迭代器
		while (it.hasNext()) { // 判断是否有下一个元素
			String str = (String) it.next(); // 获取集合中元素
			System.out.println(str);
		}
	}
}
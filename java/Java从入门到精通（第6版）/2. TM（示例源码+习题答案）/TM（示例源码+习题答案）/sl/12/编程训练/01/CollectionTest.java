import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionTest // 创建一个CollectionTest类
{
	public static void main(String[] args) {
		Collection westList = new ArrayList(); // 用ArrayList实现Collection接口
		// 使用add()方法向集合c中添加元素
		westList.add("唐僧");
		westList.add("孙悟空");
		westList.add("八戒");
		westList.add("沙和尚");
		westList.add("李逵");
		System.out.println("添加元素的顺序：" + westList); // 输出集合westList
		System.out.println("控制台输出元素的顺序："); // 提示信息
		Iterator it = westList.iterator(); // 创建迭代器
		while (it.hasNext()) // 判断集合c中是否还有元素
		{
			Object element = it.next(); // 接收集合c中的元素
			System.out.print(element + "　"); // 输出集合c中的元素
		}
		System.out.println(); // 换行
		Collection books = new HashSet(); // 用HashSet实现Collection接口
		// 使用add()方法向集合books中添加元素
		books.add("《三国演义》");
		books.add("《水浒传》");
		books.add("《红楼梦》");
		System.out.println("添加元素的顺序：" + books); // 输出集合westList
		System.out.println("控制台输出元素的顺序："); // 提示信息
		Iterator iter = books.iterator(); // 创建迭代器
		while (iter.hasNext()) // 判断集合books中是否还有元素
		{
			Object element = iter.next(); // 接收集合books中的元素
			System.out.print(element + "　"); // 输出集合books中的元素
		}
	}
}

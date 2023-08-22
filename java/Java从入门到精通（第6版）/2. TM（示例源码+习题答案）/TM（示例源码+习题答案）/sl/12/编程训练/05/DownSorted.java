
import java.util.TreeSet;

class Down implements Comparable { // 创建一个Down（降序）类实现Comparable接口
	int number; // 声明一个int类型的变量number

	public Down(int number) { // 创建有参构造方法
		this.number = number; // 使用this关键区分同名的参数和变量，并将参数的值赋给变量
	}

	@Override
	public String toString() { // 重写toString()方法
		return "number=" + number; // 返回输出的结果信息和格式
	}

	@Override
	public boolean equals(Object obj) { // 重写equals()方法
		if (this == obj) // 当this与obj这两个对象相同时
			return true; // 返回true
		if (obj != null && obj.getClass() == Down.class) { // 当obj不为null且obj与Down这两个类的类型相同时
			Down down = (Down) obj; // 通过类型转换，把obj转换为Down对象down
			return down.number == this.number; // 返回“down.number == this.number”的返回值
		}
		return false; // 以上条件都不成立时，返回false
	}

	@Override
	public int compareTo(Object obj) { // 重写compareTo()方法
		Down down = (Down) obj; // 通过类型转换，把obj转换为Down对象down
		if (number > down.number) { // 当变量number大于down中的number
			return -1;
		} else if (number == down.number) { // 当变量number等于down中的number
			return 0;
		} else { // 以上条件都不成立时
			return 1;
		}
	}
}

public class DownSorted { // 创建一个DownSorted（降序排列）类
	public static void main(String[] args) {
		TreeSet<Down> tSet = new TreeSet<>(); // 创建TreeSet对象
		// 使用add()方法向集合tSet中添加元素
		tSet.add(new Down(-5));
		tSet.add(new Down(-7));
		tSet.add(new Down(3));
		tSet.add(new Down(6));
		tSet.add(new Down(10));
		System.out.println("“-5，-7，3，6，10” 经定制排序（降序）后，得到的结果：\n" + tSet); // 输出集合tSet
	}
}

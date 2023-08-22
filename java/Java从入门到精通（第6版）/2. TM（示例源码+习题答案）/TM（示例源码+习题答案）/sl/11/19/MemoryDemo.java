public class MemoryDemo {
	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime(); // 获取本地Runtime对象
		Integer ints[] = new Integer[10000]; // 创建长度为一万的整型数组
		long before = r.freeMemory(); // 获取当前空闲内存数
		System.out.println("赋值前空闲内存字节数：" + before);
		// 循环为整型数组赋值
		for (int i = 0, length = ints.length; i < length; i++) {
			ints[i] = i;// 赋值
		}
		long after = r.freeMemory(); // 获取当前空闲内存数
		System.out.println("赋值后空闲内存字节数：" + after);
		// 输出数组用掉的内存量
		System.out.println("数组用掉的内存字节数：" + (before - after));
	}
}

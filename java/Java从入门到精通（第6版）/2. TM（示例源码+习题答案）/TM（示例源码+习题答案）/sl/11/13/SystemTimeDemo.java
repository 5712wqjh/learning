public class SystemTimeDemo {
	public static void main(String[] args) {
		long start = System.currentTimeMillis(); // 程序开始记录时间
		String str = null; // 创建null字符串
		for (int i = 0; i < 10000; i++) { // 循环一万次
			str += i; // 字符串与循环变量拼接
		}
		long end = System.currentTimeMillis(); // 记录循环结束时间
		System.out.println("循环用时：" + (end - start) + "毫秒");
	}
}

public class GetSum {
	public static void main(String args[]) {
		int x = 1; // 从1开始
		int sum = 0; // 相加的结果
		while (x <= 1000) {// 循环1000次
			sum = sum + x; // sum与之前计算的和相加
			x++; // 每次循环后x的值+1
		}
		System.out.println("sum = " + sum); // 输出最终的相加结果
	}
}

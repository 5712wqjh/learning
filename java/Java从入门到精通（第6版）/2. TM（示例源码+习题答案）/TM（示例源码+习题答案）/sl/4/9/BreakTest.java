public class BreakTest {
	public static void main(String[] args) {
		for (int i = 1; i < 20; i++) {		// 如果i是偶数
			if (i % 2 == 0) {				// 如果i是偶数
				System.out.println(i);		// 输出i的值
				break;						// 跳到下一循环
			}
		}
		System.out.println("---end---");		// 结束时输出一行文字
	}
}

public class BreakInsideNested2 {
	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {// 外层循环
			for (int j = 1; j <= 5; j++) {// 内层循环
				if (j == 4) { // 内层循环至第4次时就结束
					break;
				}
				System.out.println("i=" + i + " j=" + j);
			}
		}
	}
}

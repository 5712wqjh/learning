public class Calculation {
	public static void main(String[] args) {
		int boys = 15;// 男生人数
		int girls = 17;// 女生人数
		int totle = boys + girls;// 总人数
		// 男生人数大于女生人数，并且总人数大于30人
		boolean result1 = ((boys > girls) && (totle > 30));
		// 男生人数大于女生人数，或者总人数大于30人
		boolean result2 = ((boys > girls) || (totle > 30));
		// 输出结果
		System.out.println("男生人数大于女生人数并且总人数大于30人:" + result1);
		System.out.println("男生人数大于女生人数或者总人数大于30人:" + result2);
	}
}


public class Repetition {
	public static void main(String args[]) {
		int arr[] = { 5, 13, 96 }; // 一维整型数组
		System.out.println("一维数组中的元素分别为：");
		// x的类型与arr元素的类型相同。for循环依次取出arr中的值并赋给x
		for (int x : arr) {
			System.out.println(x);// 输出遍历出的元素值
		}
	}
}

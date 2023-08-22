
public class ChangeDemo {

	public static int[] exchange(int[] arr) {
		int tmp = arr[0];// 创建布局变量tmp，保存数组第一个元素的值
		arr[0] = arr[1];// 第二个元素值赋给第一个元素
		arr[1] = tmp;// 第二个元素值改为tmp
		return arr;
	}

	public static void main(String[] args) {
		int arr[] = { 17, 29 };
		System.out.println("第一个值=" + arr[0] + ",第二个值=" + arr[1]);
		arr = exchange(arr);
		System.out.println("第一个值=" + arr[0] + ",第二个值=" + arr[1]);
	}

}

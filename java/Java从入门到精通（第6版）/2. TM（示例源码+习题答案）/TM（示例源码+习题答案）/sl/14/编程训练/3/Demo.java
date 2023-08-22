
interface Sortable {
	void sort(int arr[]);
}

public class Demo {

	public static void main(String[] args) {
		Sortable s = java.util.Arrays::sort;
		int arr[] = { 9, 4, 1, 5, 2, 6, 3 };
		s.sort(arr);
		for (int x : arr) {
			System.out.print(x + " ");
		}
	}
}

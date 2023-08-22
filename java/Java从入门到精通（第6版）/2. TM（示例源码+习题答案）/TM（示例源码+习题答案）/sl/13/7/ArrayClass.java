
public class ArrayClass<T> {
	private T[] array; // 定义泛型数组

	public T[] getArray() {
		return array;
	}

	public void setArray(T[] array) {
		this.array = array;
	}

	public static void main(String[] args) {
		ArrayClass<String> demo = new ArrayClass<String>();
		String value[] = { "成员1", "成员2", "成员3", "成员4", "成员5" };
		demo.setArray(value);
		String array[] = demo.getArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}

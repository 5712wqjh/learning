
public class ArrayClass<T> {
	private T[] array; // ���巺������

	public T[] getArray() {
		return array;
	}

	public void setArray(T[] array) {
		this.array = array;
	}

	public static void main(String[] args) {
		ArrayClass<String> demo = new ArrayClass<String>();
		String value[] = { "��Ա1", "��Ա2", "��Ա3", "��Ա4", "��Ա5" };
		demo.setArray(value);
		String array[] = demo.getArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}

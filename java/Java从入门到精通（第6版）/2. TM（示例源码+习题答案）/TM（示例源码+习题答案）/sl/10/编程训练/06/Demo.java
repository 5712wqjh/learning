public class Demo {
	public static void main(String[] args) {
		String str = "012345";
		int length = str.length();
		int index = -1;// �м��ַ�������
		if (length % 2 == 0) {
			index = (length - 1) / 2;
		} else {
			index = length / 2;
		}
		System.out.println(str.charAt(index));
	}
}
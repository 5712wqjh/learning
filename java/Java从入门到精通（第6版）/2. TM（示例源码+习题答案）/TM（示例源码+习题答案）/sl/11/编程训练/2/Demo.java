
public class Demo {
	public static void main(String[] args) {
		String str = "JDK 11.0.1";
		char cs[] = str.toCharArray();
		for (char c : cs) {
			System.out.print("�ַ�'" + c + "'");
			if (Character.isLetter(c)) {
				System.out.println("����ĸ");

			} else if (Character.isDigit(c)) {
				System.out.println("������");
			} else {
				System.out.println("�Ȳ�����ĸҲ��������");
			}
		}
	}
}

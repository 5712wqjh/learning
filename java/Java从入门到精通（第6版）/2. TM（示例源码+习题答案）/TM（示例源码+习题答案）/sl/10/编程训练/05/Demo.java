public class Demo {

	public boolean check(String original, String substr) {
		return original.indexOf(original) == original.lastIndexOf(substr);
	}

	public static void main(String[] args) {
		Demo d = new Demo();
		String original = "������ʱ�䣬�͵��ڽ�Լʱ��";
		String substr = "ʱ��";
		if (d.check(original, substr)) {
			System.out.println("���ַ�����ԭ�ַ���ֻ���ֹ�һ��");
		} else {
			System.out.println("���ַ�����ԭ�ַ��г����˶��");
		}
	}
}
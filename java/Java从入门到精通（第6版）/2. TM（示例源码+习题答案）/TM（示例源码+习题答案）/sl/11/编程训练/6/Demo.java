public class Demo {
	public static void main(String[] args) {
		long time1 = System.currentTimeMillis();
		String str = null;
		for (int i = 0; i < 10000; i++) {
			str += "a";
		}
		long time2 = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			str.concat("a");
		}

		long time3 = System.currentTimeMillis();
		System.out.println("+=��ʱ��"+(time2 - time1));
		System.out.println("concat()��ʱ��"+(time3 - time2));
	}
}

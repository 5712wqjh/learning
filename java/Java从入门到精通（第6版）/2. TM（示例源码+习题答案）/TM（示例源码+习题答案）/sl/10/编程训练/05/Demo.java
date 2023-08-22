public class Demo {

	public boolean check(String original, String substr) {
		return original.indexOf(original) == original.lastIndexOf(substr);
	}

	public static void main(String[] args) {
		Demo d = new Demo();
		String original = "合理安排时间，就等于节约时间";
		String substr = "时间";
		if (d.check(original, substr)) {
			System.out.println("子字符串在原字符中只出现过一次");
		} else {
			System.out.println("子字符串在原字符中出现了多次");
		}
	}
}
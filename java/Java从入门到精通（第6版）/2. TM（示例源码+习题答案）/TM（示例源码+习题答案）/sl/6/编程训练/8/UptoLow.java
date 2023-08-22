
public class UptoLow {
	public static void main(String[] args) {
		StringBuffer sbf = new StringBuffer();
		sbf.append(args[0] + ' ');
		sbf.append(args[1] + ' ');
		sbf.append(args[2] + '?');
		System.out.println("把main函数参数中的小写字母转为大写的结果：" + sbf.toString().toUpperCase());
	}
}

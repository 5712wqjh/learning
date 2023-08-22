
public class IntegerDemo {
	public static void main(String[] args) {
		int num = Integer.parseInt("456"); // 将字符串转换为int类型
		Integer iNum = Integer.valueOf("456"); // 通过构造函数创建一个Integer对象
		System.out.println("int数据与Integer对象的比较：" + iNum.equals(num));
		String str2 = Integer.toBinaryString(num); // 获取数字的二进制表示
		String str3 = Integer.toHexString(num); // 获取数字的十六进制表示
		String str4 = Integer.toOctalString(num); // 获取数字的八进制表示
		String str5 = Integer.toString(num, 15); // 获取数字的十五进制表示
		System.out.println("456的二进制表示为：" + str2);
		System.out.println("456的十六进制表示为：" + str3);
		System.out.println("456的八进制表示为：" + str4);
		System.out.println("456的十五进制表示为：" + str5);
	}
}

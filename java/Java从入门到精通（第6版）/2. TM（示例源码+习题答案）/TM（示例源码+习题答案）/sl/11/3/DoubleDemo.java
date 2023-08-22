public class DoubleDemo {
	public static void main(String[] args) {
		Double dNum = Double.valueOf("3.14"); // 通过构造函数创建一个Integer对象
		// 判断是否为非数字值
		System.out.println("3.14是否为非数字值：" + Double.isNaN(dNum.doubleValue()));
		System.out.println("3.14转换为int值为：" + dNum.intValue()); // 转换为int类型
		// 判断大小
		System.out.println("值为3.14的Double对象与3.14的比较结果：" + dNum.equals(3.14));
		// 转换为十六进制
		System.out.println("3.14的十六进制表示为：" + Double.toHexString(dNum));
	}
}

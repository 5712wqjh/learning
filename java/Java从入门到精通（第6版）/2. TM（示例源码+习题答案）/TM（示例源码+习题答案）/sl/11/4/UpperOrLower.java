
public class UpperOrLower {
	public static void main(String args[]) { // 主方法
		Character mychar1 = Character.valueOf('A'); // 声明Character对象
		Character mychar2 = Character.valueOf('a'); // 声明Character对象
		if (Character.isUpperCase(mychar1)) { // 判断是否为大写字母
			System.out.println(mychar1 + "是大写字母 ");
			// 转换为小写
			System.out.println("转换为小写字母的结果： " + Character.toLowerCase(mychar1));
		}
		if (Character.isLowerCase(mychar2)) { // 判断是否为小写字母
			System.out.println(mychar2 + "是小写字母");
			// 转换为大写
			System.out.println("转换为大写字母的结果： " + Character.toUpperCase(mychar2));
		}
	}
}

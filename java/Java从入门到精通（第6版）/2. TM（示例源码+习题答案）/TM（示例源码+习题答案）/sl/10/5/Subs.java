
public class Subs { // 创建类
	public static void main(String args[]) { // 主方法
		String str = "《将进酒》：李白（唐）"; // 定义的字符串
		String substr = str.substring(6, 8); // 对字符串进行截取
		System.out.println("《将进酒》的作者是" + substr); // 输出截取后的字符串
	}
}

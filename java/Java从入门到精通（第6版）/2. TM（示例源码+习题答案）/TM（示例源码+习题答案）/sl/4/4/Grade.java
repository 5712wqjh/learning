import java.util.Scanner;						//引入Scanner类
public class Grade {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in); 		// 创建扫描器，接收控制台输入内容
		System.out.print("请输入成绩：");			// 输出字符串
		int grade = sc.nextInt();					// 获取控制台输入的数字
		switch (grade) {							// 使用switch判断数字
		case 10:									// 如果等于10，则继续执行下一行代码
		case 9:									// 如果等于9
			System.out.println("成绩为优");		// 输出成绩为优
			break;								// 结束判断
		case 8:									// 如果等于8
			System.out.println("成绩为良");		// 输出成绩为良
			break;								// 结束判断
		case 7:									// 如果等于7，则继续执行下一行代码
		case 6:										// 如果等于6
			System.out.println("成绩为中");			// 输出成绩为中
			break;									// 结束判断
		case 5:										// 如果等于5，则继续执行下一行代码
		case 4:										// 如果等于4，则继续执行下一行代码
		case 3:										// 如果等于3，则继续执行下一行代码
		case 2:										// 如果等于5，则继续执行下一行代码
		case 1:										// 如果等于1，则继续执行下一行代码
		case 0: 										// 如果等于0
			System.out.println("成绩为差");			// 输出成绩为差
			break;									// 结束判断
		default:										// 如果不符合以上任何一个结果
			System.out.println("成绩无效");			// 输出成绩无效
		}
		sc.close();									// 关闭扫描器
	}
}

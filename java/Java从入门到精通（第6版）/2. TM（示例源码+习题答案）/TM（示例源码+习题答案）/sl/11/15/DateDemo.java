import java.util.Date;
public class DateDemo {
	public static void main(String[] args) {
		Date date = new Date(); // 创建现在的日期
		long value = date.getTime(); // 获得毫秒数
		System.out.println("日期：" + date);
		System.out.println("到现在所经历的毫秒数为： " + value);
	}
}

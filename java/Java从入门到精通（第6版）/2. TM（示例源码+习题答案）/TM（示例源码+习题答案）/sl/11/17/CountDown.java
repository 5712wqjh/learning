
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CountDown {
	public static void main(String[] args) {
		System.out.println("——————————共和国建立100周年倒计时——————————");
		Date date = new Date(); // 当前时间
		// 创建SimpleDateFormat对象，指定目标格式
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
		// 调用format方法，格式化时间，转换为指定方法
		String today = simpleDateFormat.format(date);
		System.out.println("今天是" + today); // 输出当前日期
		// 获取自1970年1月1日至当前时间所经过的毫秒数
		long time1 = date.getTime();
		// 使用默认时区和语言环境获得一个日历calendar
		Calendar calendar = Calendar.getInstance();
		// 设置日历calendar中的 年、月 和日的值。因为月份是从0开始计算的，所以这里要减一
		calendar.set(2049, 10 - 1, 1);
		// 计算自1970年1月1日至2049年10月1日所经过的毫秒数
		long time2 = calendar.getTimeInMillis();
		// 计算2049年10月1日距离当前时间相差的天数
		long day = (time2 - time1) / (1000 * 60 * 60 * 24);
		System.out.println("距离2049年10月1日还有 " + day + " 天！");
	}
}

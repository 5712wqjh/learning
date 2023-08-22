
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatDemo {
	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("yyyy年MM月dd日 EEEE HH时mm分ss秒");
		System.out.print("各位观众大家好，现在是");
		System.out.print(df.format(new Date()));
		System.out.println("，欢迎收看新闻。");
	}

}

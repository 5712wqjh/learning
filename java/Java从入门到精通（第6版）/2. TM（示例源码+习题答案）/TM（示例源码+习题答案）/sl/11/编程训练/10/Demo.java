import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo {
	public static void main(String[] args) {
		String dateStr="������2021��08��08��13��20��05��";
		SimpleDateFormat s1=new SimpleDateFormat("������yyyy��MM��dd��HH��mm��ss��");
		Date date=null;
		try {
			 date=s1.parse(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		SimpleDateFormat s2=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println(s2.format(date));
	}
}

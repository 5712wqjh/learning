
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatDemo {
	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("yyyy��MM��dd�� EEEE HHʱmm��ss��");
		System.out.print("��λ���ڴ�Һã�������");
		System.out.print(df.format(new Date()));
		System.out.println("����ӭ�տ����š�");
	}

}

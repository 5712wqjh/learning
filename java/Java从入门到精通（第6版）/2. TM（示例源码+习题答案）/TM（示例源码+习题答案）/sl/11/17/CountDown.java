
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CountDown {
	public static void main(String[] args) {
		System.out.println("�����������������������͹�����100���굹��ʱ��������������������");
		Date date = new Date(); // ��ǰʱ��
		// ����SimpleDateFormat����ָ��Ŀ���ʽ
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy��MM��dd��");
		// ����format��������ʽ��ʱ�䣬ת��Ϊָ������
		String today = simpleDateFormat.format(date);
		System.out.println("������" + today); // �����ǰ����
		// ��ȡ��1970��1��1������ǰʱ���������ĺ�����
		long time1 = date.getTime();
		// ʹ��Ĭ��ʱ�������Ի������һ������calendar
		Calendar calendar = Calendar.getInstance();
		// ��������calendar�е� �ꡢ�� ���յ�ֵ����Ϊ�·��Ǵ�0��ʼ����ģ���������Ҫ��һ
		calendar.set(2049, 10 - 1, 1);
		// ������1970��1��1����2049��10��1���������ĺ�����
		long time2 = calendar.getTimeInMillis();
		// ����2049��10��1�վ��뵱ǰʱ����������
		long day = (time2 - time1) / (1000 * 60 * 60 * 24);
		System.out.println("����2049��10��1�ջ��� " + day + " �죡");
	}
}

import java.util.Date;
public class DateDemo {
	public static void main(String[] args) {
		Date date = new Date(); // �������ڵ�����
		long value = date.getTime(); // ��ú�����
		System.out.println("���ڣ�" + date);
		System.out.println("�������������ĺ�����Ϊ�� " + value);
	}
}


import java.util.Scanner;

enum Week { // ����һ��ö�٣�������¼һ�ܵ�����
	MONDAY("����һ"), TUESDAY("���ڶ�"), WEDNESDAY("������"), THURSDAY("������"), FRIDAY("������"), SATURDAY("������"), SUNDAY("������");
	String week; // ����һ����������Ϊ��ʱ����

	Week(String week) { // ����ö�ٹ��캯��
		this.week = week;
	}

	public String getName() { // ��ȡö�ٳ�����Ӧ��ֵ
		return week;
	}

	public static Week getWeek(String week) { // ����һ����̬�������������������ȡ��ӦWeekö��ֵ
		switch (week) {
		case "mon":
			return Week.MONDAY;
		case "tues":
			return Week.TUESDAY;
		case "wed":
			return Week.WEDNESDAY;
		case "thru":
			return Week.THURSDAY;
		case "fri":
			return Week.FRIDAY;
		case "sat":
			return Week.SATURDAY;
		case "sun":
			return Week.SUNDAY;
		default:
			return Week.MONDAY;
		}
	}
}

public class EnumSetTest { // ����һ��EnumSetTest��
	public static void main(String[] args) {
		System.out.println("��������Ӣ�����ڶ��ձ�����"); // ��ʾ��Ϣ
		Week weekArray[] = Week.values(); // ��ȡö������
		for (Week k : weekArray) { // foreachѭ������ö������
			System.out.println(k + "����" + k.getName()); // ���ö�����Ƽ���Ӧ���ĺ���
		}

		System.out.print("\n������Ҫ��ѯ��Ӣ�����ڼ�д(Сд)��"); // ��ʾ��Ϣ
		Scanner sc = new Scanner(System.in); // ����̨����
		Week week = Week.getWeek(sc.next()); // ���������ȡö��ֵ
		switch (week) {
		case MONDAY:
			System.out.println("MONDAY��������" + week.getName()); // ��ȡö��ֵ����������
			break;
		case TUESDAY:
			System.out.println("TUESDAY����" + week.getName());
			break;
		case WEDNESDAY:
			System.out.println("WEDNESDAY����" + week.getName());
			break;
		case THURSDAY:
			System.out.println("THURSDAY����" + week.getName());
			break;
		case FRIDAY:
			System.out.println("FRIDAY����" + week.getName());
			break;
		case SATURDAY:
			System.out.println("SATURDAY����" + week.getName());
			break;
		case SUNDAY:
			System.out.println("SUNDAY����" + week.getName());
			break;
		default: // ��¼�˵�����ǡ�����Ա��ʱ�����������Ա����Ȩ��
			System.out.println("������������");
			break;
		}
		sc.close(); // �رտ���̨����
	}
}

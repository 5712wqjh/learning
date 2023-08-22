
interface SeasonInterface {							// �ļ��ӿ�
	int SPRING = 1, SUMMER = 2, AUTUMN = 3, WINTER = 4;
}

enum SeasonEnum {								// �ļ�ö��
	SPRING, SUMMER, AUTUMN, WINTER
}

public class SeasonDemo {

	public static void printSeason1(int season) {
		switch (season) {
		case SeasonInterface.SPRING:
			System.out.println("���Ǵ���");break;
		case SeasonInterface.SUMMER:
			System.out.println("�����ļ�");break;
		case SeasonInterface.AUTUMN:
			System.out.println("�����＾");break;
		case SeasonInterface.WINTER:
			System.out.println("���Ƕ���");break;
		default:
			System.out.println("�ⲻ���ļ��ĳ���ֵ");
		}
	}
	
	public static void printSeason2(SeasonEnum season) {
		switch (season) {
		case SPRING:
			System.out.println("���Ǵ���");break;
		case SUMMER:
			System.out.println("�����ļ�");break;
		case AUTUMN:
			System.out.println("�����＾");break;
		case WINTER:
			System.out.println("���Ƕ���");break;
		}
	}

	public static void main(String[] args) {
		printSeason1(SeasonInterface.SPRING);	// ʹ�ýӿڳ���������
		printSeason1(3);						// ����ʹ��������������
		printSeason1(-1);					// Ҳʹ�ýӿڳ���ֵ��������֡�ð�䡱����
		printSeason2(SeasonEnum.WINTER); 	// ʹ��ö����������ֻ����ö�����е�ֵ���޷���ð�䡱
	}
}

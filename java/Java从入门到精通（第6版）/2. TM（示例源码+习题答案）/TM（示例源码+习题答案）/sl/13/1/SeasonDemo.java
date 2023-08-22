
interface SeasonInterface {							// 四季接口
	int SPRING = 1, SUMMER = 2, AUTUMN = 3, WINTER = 4;
}

enum SeasonEnum {								// 四季枚举
	SPRING, SUMMER, AUTUMN, WINTER
}

public class SeasonDemo {

	public static void printSeason1(int season) {
		switch (season) {
		case SeasonInterface.SPRING:
			System.out.println("这是春季");break;
		case SeasonInterface.SUMMER:
			System.out.println("这是夏季");break;
		case SeasonInterface.AUTUMN:
			System.out.println("这是秋季");break;
		case SeasonInterface.WINTER:
			System.out.println("这是冬季");break;
		default:
			System.out.println("这不是四季的常量值");
		}
	}
	
	public static void printSeason2(SeasonEnum season) {
		switch (season) {
		case SPRING:
			System.out.println("这是春季");break;
		case SUMMER:
			System.out.println("这是夏季");break;
		case AUTUMN:
			System.out.println("这是秋季");break;
		case WINTER:
			System.out.println("这是冬季");break;
		}
	}

	public static void main(String[] args) {
		printSeason1(SeasonInterface.SPRING);	// 使用接口常量做参数
		printSeason1(3);						// 可以使用数字做出参数
		printSeason1(-1);					// 也使用接口常量值以外的数字“冒充”常量
		printSeason2(SeasonEnum.WINTER); 	// 使用枚举做参数，只能用枚举有中的值，无法“冒充”
	}
}

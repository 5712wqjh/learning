
public class AutoMobile {
	public AutoMobile(int oilVolume, int leftOilVolume) {
		int addOilVolume = oilVolume - leftOilVolume;
		int time = 0;
		System.out.println("即将加满油箱……");
		while (addOilVolume != 0) {
			System.out.println("还剩余" + addOilVolume + "L，已耗时" + time + "秒。");
			addOilVolume -= 2;
			time += 5;
		}
		System.out.println("还剩余" + addOilVolume + "L，已耗时" + time + "秒。");
	}

	public static void main(String[] args) {
		AutoMobile am = new AutoMobile(30, 6);
	}
}

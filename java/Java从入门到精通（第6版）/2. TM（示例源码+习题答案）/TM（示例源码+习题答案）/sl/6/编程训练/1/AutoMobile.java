
public class AutoMobile {
	public AutoMobile(int oilVolume, int leftOilVolume) {
		int addOilVolume = oilVolume - leftOilVolume;
		int time = 0;
		System.out.println("�����������䡭��");
		while (addOilVolume != 0) {
			System.out.println("��ʣ��" + addOilVolume + "L���Ѻ�ʱ" + time + "�롣");
			addOilVolume -= 2;
			time += 5;
		}
		System.out.println("��ʣ��" + addOilVolume + "L���Ѻ�ʱ" + time + "�롣");
	}

	public static void main(String[] args) {
		AutoMobile am = new AutoMobile(30, 6);
	}
}

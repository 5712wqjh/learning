
public class GoodsVan {
	public static void main(String[] args) {
		int vanWidth = 2;
		int vanLength = 4;
		double boxWidth = 1.5;
		double boxLength = 1.5;
		int boxNumber = (int)(vanWidth/boxWidth) * (int)(vanLength/boxLength);
		System.out.println("�ػ���һ����Է�" + boxNumber + "���ӣ�");
	}
}

public class DoubleDemo {
	public static void main(String[] args) {
		Double dNum = Double.valueOf("3.14"); // ͨ�����캯������һ��Integer����
		// �ж��Ƿ�Ϊ������ֵ
		System.out.println("3.14�Ƿ�Ϊ������ֵ��" + Double.isNaN(dNum.doubleValue()));
		System.out.println("3.14ת��ΪintֵΪ��" + dNum.intValue()); // ת��Ϊint����
		// �жϴ�С
		System.out.println("ֵΪ3.14��Double������3.14�ıȽϽ����" + dNum.equals(3.14));
		// ת��Ϊʮ������
		System.out.println("3.14��ʮ�����Ʊ�ʾΪ��" + Double.toHexString(dNum));
	}
}

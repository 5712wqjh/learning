
public class IntegerDemo {
	public static void main(String[] args) {
		int num = Integer.parseInt("456"); // ���ַ���ת��Ϊint����
		Integer iNum = Integer.valueOf("456"); // ͨ�����캯������һ��Integer����
		System.out.println("int������Integer����ıȽϣ�" + iNum.equals(num));
		String str2 = Integer.toBinaryString(num); // ��ȡ���ֵĶ����Ʊ�ʾ
		String str3 = Integer.toHexString(num); // ��ȡ���ֵ�ʮ�����Ʊ�ʾ
		String str4 = Integer.toOctalString(num); // ��ȡ���ֵİ˽��Ʊ�ʾ
		String str5 = Integer.toString(num, 15); // ��ȡ���ֵ�ʮ����Ʊ�ʾ
		System.out.println("456�Ķ����Ʊ�ʾΪ��" + str2);
		System.out.println("456��ʮ�����Ʊ�ʾΪ��" + str3);
		System.out.println("456�İ˽��Ʊ�ʾΪ��" + str4);
		System.out.println("456��ʮ����Ʊ�ʾΪ��" + str5);
	}
}

public class Calculation {
	public static void main(String[] args) {
		int boys = 15;// ��������
		int girls = 17;// Ů������
		int totle = boys + girls;// ������
		// ������������Ů����������������������30��
		boolean result1 = ((boys > girls) && (totle > 30));
		// ������������Ů����������������������30��
		boolean result2 = ((boys > girls) || (totle > 30));
		// ������
		System.out.println("������������Ů��������������������30��:" + result1);
		System.out.println("������������Ů��������������������30��:" + result2);
	}
}

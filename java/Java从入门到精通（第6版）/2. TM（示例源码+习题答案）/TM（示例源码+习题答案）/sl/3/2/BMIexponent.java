public class BMIexponent {
	public static void main(String[] args) {
		double height = 1.72;					// ��߱�������λ����
		int weight = 70; 						// ���ر���,��λ:ǧ��
		double exponent = weight / (height * height); 	// BMI���㹫ʽ
		System.out.println("�������Ϊ��" + height);
		System.out.println("��������Ϊ��" + weight);
		System.out.println("����BMIָ��Ϊ��" + exponent);
		System.out.print("�����������ڣ�");
		if (exponent < 18.5) { 					// �ж�BMIָ���Ƿ�С��18.5
			System.out.println("���ع���");
		}
		if (exponent >= 18.5 && exponent < 24.9) {	// �ж�BMIָ���Ƿ���18.5��24.9֮��
			System.out.println("������Χ");
		}
		if (exponent >= 24.9 && exponent < 29.9) {	// �ж�BMIָ���Ƿ���24.9��29.9֮��
			System.out.println("���ع���");
		}
		if (exponent >= 29.9) {					// �ж�BMIָ���Ƿ����29.9֮��
			System.out.println("����");
		}
	}
}

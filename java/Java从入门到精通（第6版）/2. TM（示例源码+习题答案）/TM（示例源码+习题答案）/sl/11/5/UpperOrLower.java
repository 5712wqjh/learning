
public class UpperOrLower {
	public static void main(String args[]) { // ������
		Character mychar1 = Character.valueOf('A'); // ����Character����
		Character mychar2 = Character.valueOf('a'); // ����Character����
		if (Character.isUpperCase(mychar1)) { // �ж��Ƿ�Ϊ��д��ĸ
			System.out.println(mychar1 + "�Ǵ�д��ĸ ");
			// ת��ΪСд
			System.out.println("ת��ΪСд��ĸ�Ľ���� " + Character.toLowerCase(mychar1));
		}
		if (Character.isLowerCase(mychar2)) { // �ж��Ƿ�ΪСд��ĸ
			System.out.println(mychar2 + "��Сд��ĸ");
			// ת��Ϊ��д
			System.out.println("ת��Ϊ��д��ĸ�Ľ���� " + Character.toUpperCase(mychar2));
		}
	}
}

public class Demo {
	public static void main(String[] args) {
		String str1 = "������ɽ��" + "��" + "�ƺ��뺣��" + "��";
		System.out.println(str1);

		String str2 = "������ɽ��";
		str2 += "��";
		str2 += "�ƺ��뺣��";
		str2 += "��";
		System.out.println(str2);

		String str3 = "������ɽ��";
		str3 = str3.concat("��");
		str3 = str3.concat("�ƺ��뺣��");
		str3 = str3.concat("��");
		System.out.println(str3);
	}
}
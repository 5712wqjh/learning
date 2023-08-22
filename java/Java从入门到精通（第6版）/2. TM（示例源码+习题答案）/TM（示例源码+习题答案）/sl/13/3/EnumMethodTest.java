enum SeasonEnum { // �ļ�ö��
	SPRING, SUMMER, AUTUMN, WINTER
}

public class EnumMethodTest {
	public static void main(String[] args) {
		SeasonEnum tmp = SeasonEnum.valueOf("SUMMER");// �����ַ�������һ��ö��ֵ
		SeasonEnum es[] = SeasonEnum.values();// ��ȡ����ö��ֵ
		for (int i = 0; i < es.length; i++) {
			String message = "";// ���������Ϣ
			int result = tmp.compareTo(es[i]);// ��¼����ö�ٵıȽϽ��
			if (result < 0) {
				message = tmp + "��" + es[i] + "��ǰ��" + (-result) + "λ��";
			} else if (result > 0) {
				message = tmp + "��" + es[i] + "�ĺ��" + result + "λ��";
			} else if (result == 0) {
				message = tmp + "��" + es[i] + "��ͬһ��ֵ";
			}
			System.out.println(message);
		}
	}
}

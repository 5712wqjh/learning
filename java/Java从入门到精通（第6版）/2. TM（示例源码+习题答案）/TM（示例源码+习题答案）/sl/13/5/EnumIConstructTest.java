
enum SeasonEnum { // �ļ�ö��
	SPRING("���︴��"), SUMMER("��������"), AUTUMN("��ݿݻ�"), WINTER("��ѩ����");

	private String remarks;// ö�ٵı�ע

	private SeasonEnum(String remarks) {// ���췽��
		this.remarks = "����" + this.toString() + ",����֮��" + remarks + "��";
	}

	public String getRemarks() {// ��ȡ��עֵ
		return remarks;
	}
}

public class EnumIConstructTest {
	public static void main(String[] args) {
		SeasonEnum es[] = SeasonEnum.values();
		for (int i = 0; i < es.length; i++) {
			System.out.println(es[i].getRemarks());
		}
	}
}

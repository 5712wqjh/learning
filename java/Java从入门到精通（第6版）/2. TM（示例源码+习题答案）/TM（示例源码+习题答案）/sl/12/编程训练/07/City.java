
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class City { // ����һ��City�����У���
	public static void main(String[] args) {
		Map<String, String[]> map = new HashMap<>(); // ʹ��HashMapʵ��Map�ӿ�
		// ʹ��put()�����򼯺�map�����Ԫ��
		map.put("������",
				new String[] { "������", "�������", "ĵ����", "����", "����", "˫Ѽɽ", "�׸�", "����", "��ľ˹", "��̨��", "�ں�", "�绯", "���˰���" });
		map.put("����", new String[] { "����", "�ӱ�", "����", "��ɽ", "�׳�", "��ƽ", "��ԭ", "��Դ", "��", "ͨ��" });
		map.put("����",
				new String[] { "����", "����", "��«��", "��˳", "��Ϫ", "��˳", "����", "����", "Ӫ��", "����", "����", "����", "����", "��ɽ" });
		Iterator<String> iter = map.keySet().iterator(); // ����������
		while (iter.hasNext()) { // �жϼ���map���Ƿ�������
			Object province = iter.next(); // ����keyֵ
			System.out.println(province + "ʡ��Ҫ���У�"); // ���keyֵ
			String val[] = (String[]) map.get(province); // ����Valueֵ������ŵ�String���͵�������
			for (int i = 0; i < val.length; i++) { // ��������
				System.out.print(val[i] + "��"); // ��������е�Ԫ��
			}
			System.out.println("\n"); // ����
		}
	}
}

import java.util.*; //����java.util��������ʵ����Ҫ��Ӹ����

public class Muster { // ������Muster
	public static void main(String args[]) {
		Collection<String> list = new ArrayList<>(); // ʵ�������������
		list.add("��Java�����ŵ���ͨ��"); // �򼯺��������
		list.add("�������ѧJava��");
		list.add("��Java���ʱ��200����");
		Iterator<String> it = list.iterator(); // ����������
		while (it.hasNext()) { // �ж��Ƿ�����һ��Ԫ��
			String str = (String) it.next(); // ��ȡ������Ԫ��
			System.out.println(str);
		}
	}
}
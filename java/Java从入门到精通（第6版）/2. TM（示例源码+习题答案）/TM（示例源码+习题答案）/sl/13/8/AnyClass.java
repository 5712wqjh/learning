
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AnyClass {
	public static void main(String[] args) {
		// ����ArrayList���������������ڵ�ֵ����ΪInteger
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1); // Ϊ���������ֵ
		for (int i = 0; i < a.size(); i++) {
			// ���������ĳ��ȣ�ѭ����ʾ�����ڵ�ֵ
			System.out.println("��ȡArrayList������ֵ��" + a.get(i));
		}
		// ����HashMap���������������ļ������ֵ���ͷֱ�ΪInteger��String��
		Map<Integer, String> m = new HashMap<Integer, String>();
		for (int i = 0; i < 5; i++) {
			m.put(i, "��Ա" + i); // Ϊ�������������ֵ
		}
		for (int i = 0; i < m.size(); i++) {
			// ���ݼ�����ȡ��ֵ
			System.out.println("��ȡMap������ֵ" + m.get(i));
		}
	}
}

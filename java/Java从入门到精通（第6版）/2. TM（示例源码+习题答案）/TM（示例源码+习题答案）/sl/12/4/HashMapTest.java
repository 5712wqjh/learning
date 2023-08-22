import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>(); // ����Map���϶���
		map.put("ISBN-978654", "Java�����ŵ���ͨ"); // ��Map���������Ԫ��
		map.put("ISBN-978361", "Android�����ŵ���ͨ");
		map.put("ISBN-978893", "21��ѧAndroid");
		map.put("ISBN-978756", "21��ѧJava");
		Set<String> set = map.keySet(); // ����Map����������key��Set����
		Iterator<String> it = set.iterator(); // ����Iterator������
		System.out.println("keyֵ��");
		while (it.hasNext()) { // ���������Map�����е�keyֵ
			System.out.print(it.next() + "��");
		}
		Collection<String> coll = map.values(); // ����Map����������valueֵ�ļ���
		it = coll.iterator();
		System.out.println("\nvalueֵ��");
		while (it.hasNext()) { // ���������Map�����е�valueֵ
			System.out.print(it.next() + "��");
		}
	}
}

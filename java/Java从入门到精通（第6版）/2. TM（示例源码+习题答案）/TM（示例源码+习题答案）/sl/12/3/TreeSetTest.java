import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest { // ����TreeSetTest��
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>(); // ʹ�� TreeSet����Set���϶���
		// ��Set���������Ԫ��
		set.add(-5);
		set.add(-7);
		set.add(10);
		set.add(6);
		set.add(3);
		// ����Iterator����������
		Iterator<Integer> it = set.iterator();
		System.out.print("Set�����е�Ԫ�أ�"); // ��ʾ��Ϣ
		// ���������Set�����е�Ԫ��
		while (it.hasNext()) {
			System.out.print(it.next() + "��");
		}
	}
}
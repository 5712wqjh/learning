import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionTest // ����һ��CollectionTest��
{
	public static void main(String[] args) {
		Collection westList = new ArrayList(); // ��ArrayListʵ��Collection�ӿ�
		// ʹ��add()�����򼯺�c�����Ԫ��
		westList.add("��ɮ");
		westList.add("�����");
		westList.add("�˽�");
		westList.add("ɳ����");
		westList.add("����");
		System.out.println("���Ԫ�ص�˳��" + westList); // �������westList
		System.out.println("����̨���Ԫ�ص�˳��"); // ��ʾ��Ϣ
		Iterator it = westList.iterator(); // ����������
		while (it.hasNext()) // �жϼ���c���Ƿ���Ԫ��
		{
			Object element = it.next(); // ���ռ���c�е�Ԫ��
			System.out.print(element + "��"); // �������c�е�Ԫ��
		}
		System.out.println(); // ����
		Collection books = new HashSet(); // ��HashSetʵ��Collection�ӿ�
		// ʹ��add()�����򼯺�books�����Ԫ��
		books.add("���������塷");
		books.add("��ˮ䰴���");
		books.add("����¥�Ρ�");
		System.out.println("���Ԫ�ص�˳��" + books); // �������westList
		System.out.println("����̨���Ԫ�ص�˳��"); // ��ʾ��Ϣ
		Iterator iter = books.iterator(); // ����������
		while (iter.hasNext()) // �жϼ���books���Ƿ���Ԫ��
		{
			Object element = iter.next(); // ���ռ���books�е�Ԫ��
			System.out.print(element + "��"); // �������books�е�Ԫ��
		}
	}
}

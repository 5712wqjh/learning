
import java.util.ArrayList;
import java.util.List;

public class Books { // ����һ��Books��
	public static void main(String[] args) {
		List<String> shelf = new ArrayList<>(); // ʹ��ArrayListʵ��List�ӿ�
		// ʹ��add()�����򼯺�shelf�����Ԫ��
		shelf.add("���������塷");
		shelf.add("��ɯʿ����ʫѡ��");
		shelf.add("����¥�Ρ�");
		System.out.println("����ϵ��鼮��" + shelf); // �������shelf�е�Ԫ��
		List<String> desk = new ArrayList<>(); // ʹ��LinkedListʵ��List�ӿ�
		// ʹ��add()�����򼯺�desk�����Ԫ��
		desk.add("�����μǡ�");
		desk.add("��ˮ䰴���");
		System.out.println("�����ϵ��鼮��" + desk); // �������desk�е�Ԫ��
		System.out.println("\n���ڿ�ʼ�����Ĵ���������\n"); // ��ʾ��Ϣ
		shelf.add(0, desk.get(1)); // �ڼ���shelf����Ϊ0��λ���ϣ���Ӽ���desk������Ϊ1��Ԫ��
		shelf.set(2, desk.get(0)); // �Ѽ���shelf����Ϊ2��Ԫ�ظ���Ϊ����desk������Ϊ0��Ԫ��
		System.out.print("�й����Ĵ������ֱ��ǣ�"); // ��ʾ��Ϣ
		for (int i = 0; i < shelf.size(); i++) {
			System.out.print(shelf.get(i) + "��"); // �������shelf�е�Ԫ��
		}
	}
}

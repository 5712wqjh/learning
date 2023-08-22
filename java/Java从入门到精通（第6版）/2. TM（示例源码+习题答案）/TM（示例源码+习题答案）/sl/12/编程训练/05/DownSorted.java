
import java.util.TreeSet;

class Down implements Comparable { // ����һ��Down��������ʵ��Comparable�ӿ�
	int number; // ����һ��int���͵ı���number

	public Down(int number) { // �����вι��췽��
		this.number = number; // ʹ��this�ؼ�����ͬ���Ĳ����ͱ���������������ֵ��������
	}

	@Override
	public String toString() { // ��дtoString()����
		return "number=" + number; // ��������Ľ����Ϣ�͸�ʽ
	}

	@Override
	public boolean equals(Object obj) { // ��дequals()����
		if (this == obj) // ��this��obj������������ͬʱ
			return true; // ����true
		if (obj != null && obj.getClass() == Down.class) { // ��obj��Ϊnull��obj��Down���������������ͬʱ
			Down down = (Down) obj; // ͨ������ת������objת��ΪDown����down
			return down.number == this.number; // ���ء�down.number == this.number���ķ���ֵ
		}
		return false; // ����������������ʱ������false
	}

	@Override
	public int compareTo(Object obj) { // ��дcompareTo()����
		Down down = (Down) obj; // ͨ������ת������objת��ΪDown����down
		if (number > down.number) { // ������number����down�е�number
			return -1;
		} else if (number == down.number) { // ������number����down�е�number
			return 0;
		} else { // ����������������ʱ
			return 1;
		}
	}
}

public class DownSorted { // ����һ��DownSorted���������У���
	public static void main(String[] args) {
		TreeSet<Down> tSet = new TreeSet<>(); // ����TreeSet����
		// ʹ��add()�����򼯺�tSet�����Ԫ��
		tSet.add(new Down(-5));
		tSet.add(new Down(-7));
		tSet.add(new Down(3));
		tSet.add(new Down(6));
		tSet.add(new Down(10));
		System.out.println("��-5��-7��3��6��10�� ���������򣨽��򣩺󣬵õ��Ľ����\n" + tSet); // �������tSet
	}
}

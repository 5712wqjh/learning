
public class EggCake {
	int eggCount; // ��������ﵰ�ĸ���

	public EggCake(int eggCount) { // ����Ϊ��������ﵰ�ĸ����Ĺ��췽��
		this.eggCount = eggCount; // ������eggCount��ֵ��������eggCount
	}

	public EggCake() { // �޲������췽����Ĭ�ϸ�����һ����
		// ���ò���Ϊ��������ﵰ�ĸ����Ĺ��췽���������ü�������ﵰ�ĸ���Ϊ1
		this(1);
	}

	public static void main(String[] args) {
		EggCake cake1 = new EggCake();
		System.out.println("�˿Ͳ�Ҫ��ӵ����������������" + cake1.eggCount + "������");
		EggCake cake2 = new EggCake(2);
		System.out.println("�˿�Ҫ���2�������������" + cake2.eggCount + "������");
	}
	
}





public class Cust {// �˿���
	static int count = 0;// ��������ԣ�����
	String name;// ��������

	public Cust(String name) {
		this.name = name;// ��¼����
		count++;// ��������
	}

	public static void main(String[] args) {
		Cust c1 = new Cust("tom");
		System.out.println("���ǵ�" + Cust.count + "���˿ͣ��ҽ�" + c1.name);

		Cust c2 = new Cust("����");
		System.out.println("���ǵ�" + Cust.count + "���˿ͣ��ҽ�" + c2.name);

		Cust c3 = new Cust("������");
		System.out.println("���ǵ�" + Cust.count + "���˿ͣ��ҽ�" + c3.name);
	}
}

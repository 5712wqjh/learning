
public class Dog {// ��
	String name;// ����
	String Color;// ��ɫ
	String vioce;// ����

	public Dog(String name, String color, String vioce) {
		this.name = name;
		Color = color;
		this.vioce = vioce;
	}

	public void call() {// ��
		System.out.println(vioce);
	}

	public static void main(String[] args) {
		Dog d1 = new Dog("ëë", "��ɫ", "������");
		System.out.print(d1.name + "����ɫ��" + d1.Color);// ���ʶ��������
		System.out.print("��������������:");
		d1.call();// ���ʶ������Ϊ

		Dog d2 = new Dog("�һ�", "��ɫ", "���~");
		System.out.print(d2.name + "����ɫ��" + d2.Color);
		System.out.print("��������������:");
		d2.call();
	}
}


public class People {
	int id;// ���֤��
	String name;//����

	public People(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public boolean equals(Object obj) {// ��дObject��equals()����
		if (this == obj)// ��������뱾����ͬһ������
			return true;
		if (obj == null)// ���������null
			return false;
		if (getClass() != obj.getClass())// ��������뱾�����Ͳ�ͬ
			return false;
		People other = (People) obj;// ������ǿת�ɱ������
		if (id != other.id)// ������ߵ����֤�Ų����
			return false;
		return true;
	}

	public String toString() {// ��дObject��toString()����
		return  name;//ֻ�������
	}

	public static void main(String[] args) {
		People p1 = new People(220, "tom");
		People p2 = new People(220, "��ķ");
		People p3 = new People(330, "����");
		Object o = new Object();
		
		System.out.println(p1+"��"+p2+"�Ƿ�Ϊͬһ�ˣ�");
		System.out.println("equals()�����Ľ����"+p1.equals(p2));
		System.out.println("==������Ľ����"+(p1 == p2));
		
		System.out.println();
		System.out.print(p1+"��"+p3+"�Ƿ�Ϊͬһ�ˣ�");
		System.out.println(p1.equals(p3));
		
		System.out.print(p1+"��"+o+"�Ƿ�Ϊͬһ�ˣ�");
		System.out.println(p1.equals(o));
	}
}

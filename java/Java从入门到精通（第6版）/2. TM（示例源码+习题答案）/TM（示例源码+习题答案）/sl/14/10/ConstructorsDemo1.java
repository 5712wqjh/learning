interface ConstructorsInterface1 { // ���췽���ӿ�
	ConstructorsDemo1 action(); // �����޲η���
}

public class ConstructorsDemo1 { // ������

	public ConstructorsDemo1() { // �޲ι��췽��
		System.out.println("�����޲ι��췽��");
	}

	public ConstructorsDemo1(int i) { // �вι��췽��
		System.out.println("�����вι��췽��");
	}

	public static void main(String[] args) {
		// ����ConstructorsTest1��Ĺ��췽��
		ConstructorsInterface1 a = ConstructorsDemo1::new;
		ConstructorsDemo1 b = a.action(); // ͨ���޲η�����������

	}
}
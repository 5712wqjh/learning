interface ConstructorsInterface2 { // ���췽���ӿ�
	ConstructorsDemo2 action(int i); // �����вη���
}

public class ConstructorsDemo2 { // ������

	public ConstructorsDemo2() { // �޲ι��췽��
		System.out.println("�����޲ι��췽��");
	}

	public ConstructorsDemo2(int i) { // �вι��췽��
		System.out.println("�����вι��췽��������Ϊ:" + i);
	}

	public static void main(String[] args) {
		// ����ConstructorsDemo2��Ĺ��췽��
		ConstructorsInterface2 a = ConstructorsDemo2::new;
		ConstructorsDemo2 b = a.action(123); // ͨ���вη�����������
	}
}

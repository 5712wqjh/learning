class Telephone { // �绰��
	String button = "button:0~9"; // ��Ա���ԣ�10������
	void call() { // ����绰����
		System.out.println("��ʼ����绰");
	}
}

class Mobile extends Telephone { // �ֻ���̳е绰��
	String screen = "screen:Һ����"; // ��Ա���ԣ�Һ����Ļ
}

public class Demo2{
	public static void main(String[] args) {
		Mobile motto = new Mobile();
		System.out.println(motto.button); // ������ø�������
		System.out.println(motto.screen); // ������ø���û�е�����
		motto.call(); // ������ø��෽��
	}
}


public class Test {// ����һ��Test��
	public static void main(String[] args) {
		President president = new President(); // ����president����
		president.appellation = "��ͳ"; // ��ʼ����ְ�ơ�
		president.age = 55; // ��ʼ�������䡱
		if (president instanceof PublicServant)// �ж���ͳ�Ƿ�Ϊ����Ա
			president.handleAffairs(); // president�������handleAffairs()����
	}
}


interface SayHiInterface { // ���к��ӿ�
	String say(); // ���к��ķ���
}

public class NoParamterDemo { // ������
	public static void main(String[] args) {
		// lambda���ʽʵ�ִ��к��ӿڣ����س��󷽷����
		SayHiInterface pi = () -> "��ð���������lambda���ʽ";
		System.out.println(pi.say()); 
	}
}

import java.io.IOException;

public class Demo {
	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime(); // ��ȡ����Runtime����
		try {
			 r.exec("notepad"); // ִ��help�����ȡ���̶���
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}

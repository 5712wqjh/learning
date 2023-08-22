import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class RuntimeExecDemo {
	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime(); // ��ȡ����Runtime����
		try {
			Process p = r.exec("help"); // ִ��help�����ȡ���̶���
			InputStream is = p.getInputStream(); // ��ȡ���̵��ֽ�������
			// ���ֽ�������ת��Ϊ�ַ�������
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String str = null; // ����null�ַ���
			while ((str = br.readLine()) != null) { // ����ַ����п��Ի�ȡ�ǿ�����
				System.out.println(str); // ��ӡ��ȡ������
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

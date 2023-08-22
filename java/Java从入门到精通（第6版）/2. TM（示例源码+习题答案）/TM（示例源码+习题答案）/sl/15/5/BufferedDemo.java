
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDemo {
	public static void main(String args[]) {
		String content[] = { "�þò���", "�������", "����ϵ" };// д�������
		File file = new File("D:\\word.txt"); // �����ļ�����
		try {
			FileWriter fw = new FileWriter(file); // �ļ��ַ������
			BufferedWriter bw = new BufferedWriter(fw); // ���������
			for (int k = 0; k < content.length; k++) { // ����Ҫ���������
				bw.write(content[k]); // д���ַ���
				bw.newLine(); // д��һ�����з�
			}
			bw.close(); // �رջ��������
			fw.close(); // �ر��ļ��ַ������
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			FileReader fr = new FileReader(file); // �ļ��ַ�������
			BufferedReader br = new BufferedReader(fr);// ����������
			String tmp = null; // ��Ϊ�������ʱ�ַ���
			int i = 1; // ����
			// ���ļ��ж���һ�У�������������ݲ�Ϊnull�������ѭ��
			while ((tmp = br.readLine()) != null) {
				System.out.println("��" + i + "��:" + tmp); // �����ȡ������
				i++; // ��������
			}
			br.close(); // �رջ���������
			fr.close(); // �ر��ļ��ַ�������
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

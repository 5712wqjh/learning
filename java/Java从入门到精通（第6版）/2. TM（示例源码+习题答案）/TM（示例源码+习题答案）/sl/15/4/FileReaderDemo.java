
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDemo {
	public static void main(String[] args) {
		File file = new File("D:\\word.txt"); // �����ļ�����
		try { 
			FileWriter fw = new FileWriter(file); // �����ַ������
			String word = "���¼�ʱ�У��Ѿ������졣"; // д����ַ���
			fw.write(word); // ���ַ���д�뵽�ļ���
			fw.close(); // �ر���
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			FileReader fr = new FileReader(file);// �����ַ�������
			char ch[] = new char[1024]; // �����ַ�����
			int len = fr.read(ch); // ���ļ��е��ַ����뵽����������
			System.out.println("�ļ��е���Ϣ�ǣ�" + new String(ch, 0, len));// ���ַ�תΪ�ַ������
			fr.close(); // �ر���
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

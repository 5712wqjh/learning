import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class PoetryDemo {

	public static void main(String[] args) {
		File file = new File("D:\\word.txt");
		try {
			FileOutputStream out = new FileOutputStream(file);
			byte buy[] = "���߲�����������������ҹ��������������֪���١�".getBytes();
			out.write(buy);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

import java.io.File;

public class ShowFileName {

	public static void main(String[] args) {
		File dir = new File("C:\\Windows");
		File fs[] = dir.listFiles();
		for (File f : fs) {
			if(f.isFile()) {
				System.out.print("�ļ���");
			}else {
				System.out.print("�ļ��У�");
			}
			System.out.println(f.getName());
		}
	}
}

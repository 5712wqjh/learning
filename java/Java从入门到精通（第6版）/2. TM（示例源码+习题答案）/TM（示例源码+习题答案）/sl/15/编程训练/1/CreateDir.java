import java.io.File;

public class CreateDir {
	public static void main(String[] args) {
		File dir = new File("D:\\test");
		if (!dir.exists()) {
			dir.mkdir();
		}
		for (int i = 1; i <= 20; i++) {
			File dirIner = new File(dir, String.valueOf(i));
			dirIner.mkdir();
		}
		System.out.println("文件夹创建完毕");
	}
}

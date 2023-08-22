
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDemo {
	public static void main(String[] args) {
		File file = new File("D:\\word.txt"); // 创建文件对象
		try { 
			FileWriter fw = new FileWriter(file); // 创建字符输出流
			String word = "明月几时有，把酒问青天。"; // 写入的字符串
			fw.write(word); // 将字符串写入到文件中
			fw.close(); // 关闭流
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			FileReader fr = new FileReader(file);// 创建字符输入流
			char ch[] = new char[1024]; // 缓存字符数组
			int len = fr.read(ch); // 将文件中的字符读入到缓存数组中
			System.out.println("文件中的信息是：" + new String(ch, 0, len));// 将字符转为字符串输出
			fr.close(); // 关闭流
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

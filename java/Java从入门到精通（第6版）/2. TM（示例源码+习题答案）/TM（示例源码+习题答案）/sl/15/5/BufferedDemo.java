
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDemo {
	public static void main(String args[]) {
		String content[] = { "好久不见", "最近好吗", "常联系" };// 写入的内容
		File file = new File("D:\\word.txt"); // 创建文件对象
		try {
			FileWriter fw = new FileWriter(file); // 文件字符输出流
			BufferedWriter bw = new BufferedWriter(fw); // 换成输出流
			for (int k = 0; k < content.length; k++) { // 遍历要输入的内容
				bw.write(content[k]); // 写入字符串
				bw.newLine(); // 写入一个换行符
			}
			bw.close(); // 关闭缓冲输出流
			fw.close(); // 关闭文件字符输出流
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			FileReader fr = new FileReader(file); // 文件字符输入流
			BufferedReader br = new BufferedReader(fr);// 缓冲输入流
			String tmp = null; // 作为缓冲的临时字符串
			int i = 1; // 行数
			// 从文件中读出一行，如果读出的内容不为null，则进入循环
			while ((tmp = br.readLine()) != null) {
				System.out.println("第" + i + "行:" + tmp); // 输出读取的内容
				i++; // 行数递增
			}
			br.close(); // 关闭缓冲输入流
			fr.close(); // 关闭文件字符输入流
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

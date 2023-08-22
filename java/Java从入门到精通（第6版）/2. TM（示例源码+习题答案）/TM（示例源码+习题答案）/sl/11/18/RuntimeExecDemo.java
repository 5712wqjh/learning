import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class RuntimeExecDemo {
	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime(); // 获取本地Runtime对象
		try {
			Process p = r.exec("help"); // 执行help命令，获取进程对象
			InputStream is = p.getInputStream(); // 获取进程的字节输入流
			// 将字节输入流转化为字符输入流
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String str = null; // 创建null字符串
			while ((str = br.readLine()) != null) { // 如果字符流中可以获取非空内容
				System.out.println(str); // 打印获取的内容
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

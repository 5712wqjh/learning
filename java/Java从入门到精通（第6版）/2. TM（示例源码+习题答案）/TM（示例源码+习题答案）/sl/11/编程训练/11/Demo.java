import java.io.IOException;

public class Demo {
	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime(); // 获取本地Runtime对象
		try {
			 r.exec("notepad"); // 执行help命令，获取进程对象
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}

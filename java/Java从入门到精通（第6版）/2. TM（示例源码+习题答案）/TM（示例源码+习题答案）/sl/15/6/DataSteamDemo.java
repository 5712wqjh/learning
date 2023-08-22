import java.io.*;

public class DataSteamDemo {
	public static void main(String[] args) {
		File file = new File("D:\\word.txt");
		try {
			// 创建FileOutputStream对象，指定要向其中写入数据的文件
			FileOutputStream fos = new FileOutputStream(file);
			// 创建DataOutputStream对象，用来向文件中写入数据
			DataOutputStream dos = new DataOutputStream(fos);
			dos.writeUTF("使用writeUTF()方法写入数据"); // 将字符串写入文件
			dos.writeDouble(19.8); // 将double数据写入文件
			dos.writeInt(298); // 将int数据写入文件
			dos.writeBoolean(true); // 将boolean数据写入文件
			dos.close();
			fos.close();

			// 创建FileInputStream对象，指定要从中读取数据的文件
			FileInputStream fis = new FileInputStream(file);
			// 创建DataInputStream对象，用来从文件中读取文件
			DataInputStream dis = new DataInputStream(fis);
			// 读取字符串
			System.out.println("readUTF方法读取数据：" + dis.readUTF());
			// 读取double数据
			System.out.println("readDouble方法读取数据：" + dis.readDouble());
			// 读取int数据
			System.out.println("readInt方法读取数据：" + dis.readInt());
			// 读取boolean数据
			System.out.println("readBoolean方法读取数据：" + dis.readBoolean());
			dis.close();
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

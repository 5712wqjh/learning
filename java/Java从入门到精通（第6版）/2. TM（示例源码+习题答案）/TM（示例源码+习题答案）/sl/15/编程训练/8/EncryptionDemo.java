import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EncryptionDemo {
	public static int encryption(int original) {
		return (original * 2 - 11) * 3 + 17;
	}

	public static int decrypt(int ciphertext) {
		return ((ciphertext - 17) / 3 + 11) / 2;
	}

	public static void main(String[] args) {
		File file = new File("D:\\word.txt");
		int original = 11987;
		System.out.println("ԭ�ģ�" + original);
		try {
			FileOutputStream fos = new FileOutputStream(file);
			DataOutputStream dos = new DataOutputStream(fos);
			int input = encryption(original);
			System.out.println("д������ģ�" + input);
			dos.writeInt(input);
			dos.close();
			fos.close();

			FileInputStream fis = new FileInputStream(file);
			DataInputStream dis = new DataInputStream(fis);
			int ciphertext = dis.readInt();
			System.out.println("��ȡ�����ģ�" + ciphertext);
			System.out.println("���ܵĽ����" + decrypt(ciphertext));
			dis.close();
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

import java.io.*;

public class DataSteamDemo {
	public static void main(String[] args) {
		File file = new File("D:\\word.txt");
		try {
			// ����FileOutputStream����ָ��Ҫ������д�����ݵ��ļ�
			FileOutputStream fos = new FileOutputStream(file);
			// ����DataOutputStream�����������ļ���д������
			DataOutputStream dos = new DataOutputStream(fos);
			dos.writeUTF("ʹ��writeUTF()����д������"); // ���ַ���д���ļ�
			dos.writeDouble(19.8); // ��double����д���ļ�
			dos.writeInt(298); // ��int����д���ļ�
			dos.writeBoolean(true); // ��boolean����д���ļ�
			dos.close();
			fos.close();

			// ����FileInputStream����ָ��Ҫ���ж�ȡ���ݵ��ļ�
			FileInputStream fis = new FileInputStream(file);
			// ����DataInputStream�����������ļ��ж�ȡ�ļ�
			DataInputStream dis = new DataInputStream(fis);
			// ��ȡ�ַ���
			System.out.println("readUTF������ȡ���ݣ�" + dis.readUTF());
			// ��ȡdouble����
			System.out.println("readDouble������ȡ���ݣ�" + dis.readDouble());
			// ��ȡint����
			System.out.println("readInt������ȡ���ݣ�" + dis.readInt());
			// ��ȡboolean����
			System.out.println("readBoolean������ȡ���ݣ�" + dis.readBoolean());
			dis.close();
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

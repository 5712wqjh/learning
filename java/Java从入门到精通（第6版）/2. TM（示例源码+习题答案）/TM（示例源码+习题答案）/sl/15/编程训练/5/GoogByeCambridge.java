import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GoogByeCambridge {
	public static void main(String[] args) {
		String content[] = { "���ٱ��š�",
				 "  ��־Ħ",
				 "����������ˣ�",
				 "���������������",
				 "����������֣�",
				 "����������Ʋʡ�",
				 "�Ǻ��ϵĽ�����",
				 "��Ϧ���е����",
				 "���������Ӱ��",
				 "���ҵ���ͷ������",
				 "�����ϵ�������",
				 "���͵���ˮ����ҡ��",
				 "�ڿ��ӵ��Შ�",
				 "�Ҹ�����һ��ˮ�ݣ�",
				 "�������µ�һ̶��",
				 "������Ȫ�������Ϻ磻",
				 "�����ڸ���䣬",
				 "�����Ųʺ��Ƶ��Ρ�",
				 "Ѱ�Σ���һ֧���ݣ�",
				 "����ݸ��ദ���ݣ�",
				 "����һ���ǻԣ�",
				 "���ǻ԰����Ÿ衣",
				 "���Ҳ��ܷŸ裬",
				 "�����Ǳ�������",
				 "�ĳ�ҲΪ�ҳ�Ĭ��",
				 "��Ĭ�ǽ���Ŀ��ţ�",
				 "���ĵ������ˣ�",
				 "���������ĵ�����",
				 "�һ�һ�����䣬",
				 "������һƬ�Ʋʡ�"};
		
		File file = new File("D:\\word.txt"); 
		try {
			FileWriter fw = new FileWriter(file); 
			BufferedWriter bw = new BufferedWriter(fw); 
			for (int k = 0; k < content.length; k++) { 
				bw.write(content[k]); 
				bw.newLine(); 
			}
			bw.close(); 
			fw.close(); 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

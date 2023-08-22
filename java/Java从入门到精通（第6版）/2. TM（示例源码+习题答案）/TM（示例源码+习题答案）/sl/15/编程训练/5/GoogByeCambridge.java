import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GoogByeCambridge {
	public static void main(String[] args) {
		String content[] = { "《再别康桥》",
				 "  徐志摩",
				 "轻轻的我走了，",
				 "正如我轻轻的来；",
				 "我轻轻的招手，",
				 "作别西天的云彩。",
				 "那河畔的金柳，",
				 "是夕阳中的新娘；",
				 "波光里的艳影，",
				 "在我的心头荡漾。",
				 "软泥上的青荇，",
				 "油油的在水底招摇；",
				 "在康河的柔波里，",
				 "我甘心做一条水草！",
				 "那榆荫下的一潭，",
				 "不是清泉，是天上虹；",
				 "揉碎在浮藻间，",
				 "沉淀着彩虹似的梦。",
				 "寻梦？撑一支长篙，",
				 "向青草更青处漫溯；",
				 "满载一船星辉，",
				 "在星辉斑斓里放歌。",
				 "但我不能放歌，",
				 "悄悄是别离的笙箫；",
				 "夏虫也为我沉默，",
				 "沉默是今晚的康桥！",
				 "悄悄的我走了，",
				 "正如我悄悄的来；",
				 "我挥一挥衣袖，",
				 "不带走一片云彩。"};
		
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

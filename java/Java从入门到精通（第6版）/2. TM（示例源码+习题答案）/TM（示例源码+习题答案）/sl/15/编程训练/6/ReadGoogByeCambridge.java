import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadGoogByeCambridge {

	public static void main(String[] args) {
		File file = new File("D:\\word.txt");
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String tmp = null;
			while ((tmp = br.readLine()) != null) {
				System.out.println(tmp);
			}
			br.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

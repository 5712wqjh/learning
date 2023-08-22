import java.util.Date;

public class Demo {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.printf("HH:MM:SS PM格式（12时制）：%tr%n", date);
	}
}
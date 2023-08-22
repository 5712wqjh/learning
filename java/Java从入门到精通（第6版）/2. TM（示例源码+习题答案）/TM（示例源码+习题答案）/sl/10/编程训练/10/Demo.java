
public class Demo {
	public static void main(String[] args) {
		String name = "玩家1";
		int killNums = 5;
		String status = "已超神";
		String strFormat = "%s连续完成%d次击杀后，获得了%s的称号";
		System.out.printf(strFormat, name, killNums, status);
	}
}
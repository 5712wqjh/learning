
public class DaXiaoXie {
	public static void main(String[] args) {
		int i = 66;
		DaXiaoXie dxx = new DaXiaoXie();
		dxx.print(i, (char)i);
		dxx.print((char)i, i);
	}
	
	public void print(int i, char c) {
		System.out.println("在ASCII表中，" + i + "对应的大写字母是" + c + "。");
	}
	
	public void print(char c, int i) {
		System.out.println(c + "的小写字母是" + (char) (i + 32) + "。");
	}
}

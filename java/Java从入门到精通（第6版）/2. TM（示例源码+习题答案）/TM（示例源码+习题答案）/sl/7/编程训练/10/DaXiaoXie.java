
public class DaXiaoXie {
	public static void main(String[] args) {
		int i = 66;
		DaXiaoXie dxx = new DaXiaoXie();
		dxx.print(i, (char)i);
		dxx.print((char)i, i);
	}
	
	public void print(int i, char c) {
		System.out.println("��ASCII���У�" + i + "��Ӧ�Ĵ�д��ĸ��" + c + "��");
	}
	
	public void print(char c, int i) {
		System.out.println(c + "��Сд��ĸ��" + (char) (i + 32) + "��");
	}
}

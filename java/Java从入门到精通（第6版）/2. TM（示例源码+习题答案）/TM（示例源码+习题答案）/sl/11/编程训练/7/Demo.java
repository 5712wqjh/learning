import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("«Î ‰»Î±ﬂ≥§£∫");
		int l = sc.nextInt();
		for(int x=0;x<l;x++) {
			for(int y=0;y<l;y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}

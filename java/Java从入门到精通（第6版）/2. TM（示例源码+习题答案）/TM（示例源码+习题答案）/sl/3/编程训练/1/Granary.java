
public class Granary {
	public static void main(String[] args) {
		final double PI = 3.14;
		int diameter = 10;
		int height = 3;
		double volume = diameter/2 * diameter/2 * PI * height;
		System.out.println("该粮仓的体积 = " + volume + "立方米");
		int weight = 750;
		System.out.println("该粮仓一共可储存" + weight * volume + "千克粮食");
	}
}

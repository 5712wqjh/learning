
public class MathUtil {
	public double pow(double num) {
		return num * num * num * num;
	}

	public static void main(String[] args) {
		MathUtil util = new MathUtil();
		System.out.println(util.pow(45.6));
		System.out.println(util.pow(0.35));
	}
}

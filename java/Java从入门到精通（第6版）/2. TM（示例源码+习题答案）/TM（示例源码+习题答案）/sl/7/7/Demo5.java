class Quadrangle { }

class Square extends Quadrangle { }

class Circular { }

public class Demo5 {
	public static void main(String args[]) {
		Quadrangle q = new Quadrangle(); 	// 四边形对象
		Square s = new Square();			// 正方形对象
		// 判断四边形是否为正方形的子类
		System.out.println(q instanceof Square);
		// 判断正方形是否为四边形的子类
		System.out.println(s instanceof Quadrangle);
		// 由于正方形是否为圆形的子类
		System.out.println(q instanceof Circular);
	}
}

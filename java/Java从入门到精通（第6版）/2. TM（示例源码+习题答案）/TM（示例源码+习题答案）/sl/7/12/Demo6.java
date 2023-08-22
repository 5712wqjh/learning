class Shape { }								// 图形类

class Square extends Shape { }				// 正方形类继承图形类

class Circular extends Shape { }				// 圆形类继承图形类

public class Demo6 {
	public static void draw(Shape s) {			// 绘制方法
		if (s instanceof Square) {				// 如果是正方形
			System.out.println("绘制正方形");
		} else if (s instanceof Circular) {		// 如果是圆形
			System.out.println("绘制圆形");
		} else {							// 如果是其他类型
			System.out.println("绘制父类图形");
		}
	}

	public static void main(String[] args) {
		draw(new Shape());
		draw(new Square());
		draw(new Circular());
	}
}


interface Paintable { // 可绘制接口
	public void draw(); // 绘制抽象方法
}

class Quadrangle { // 四边形类
	public void doAnything() {
		System.out.println("四边形提供的方法");
	}
}

//平行四边形类,继承四边形类，并实现了可绘制接口
class Parallelogram extends Quadrangle implements Paintable {
	public void draw() { // 由于该类实现了接口，所以需要覆盖draw()方法
		System.out.println("绘制平行四边形");
	}
}

//正方形类,继承四边形类，并实现了可绘制接口
class Square extends Quadrangle implements Paintable {
	public void draw() {
		System.out.println("绘制正方形");
	}
}


//圆形类,仅实现了可绘制接口
class Circular implements Paintable {
	public void draw() {
		System.out.println("绘制圆形");
	}
}

public class Demo7 {
	public static void main(String[] args) {
		Square s = new Square();
		s.draw();
		s.doAnything();

		Parallelogram p = new Parallelogram();
		p.draw();
		p.doAnything();

		Circular c = new Circular();
		c.draw();
	}
}

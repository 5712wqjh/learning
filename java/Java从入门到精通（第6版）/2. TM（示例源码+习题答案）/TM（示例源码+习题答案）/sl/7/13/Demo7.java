
interface Paintable { // �ɻ��ƽӿ�
	public void draw(); // ���Ƴ��󷽷�
}

class Quadrangle { // �ı�����
	public void doAnything() {
		System.out.println("�ı����ṩ�ķ���");
	}
}

//ƽ���ı�����,�̳��ı����࣬��ʵ���˿ɻ��ƽӿ�
class Parallelogram extends Quadrangle implements Paintable {
	public void draw() { // ���ڸ���ʵ���˽ӿڣ�������Ҫ����draw()����
		System.out.println("����ƽ���ı���");
	}
}

//��������,�̳��ı����࣬��ʵ���˿ɻ��ƽӿ�
class Square extends Quadrangle implements Paintable {
	public void draw() {
		System.out.println("����������");
	}
}


//Բ����,��ʵ���˿ɻ��ƽӿ�
class Circular implements Paintable {
	public void draw() {
		System.out.println("����Բ��");
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

class Quadrangle { }

class Square extends Quadrangle { }

class Circular { }

public class Demo5 {
	public static void main(String args[]) {
		Quadrangle q = new Quadrangle(); 	// �ı��ζ���
		Square s = new Square();			// �����ζ���
		// �ж��ı����Ƿ�Ϊ�����ε�����
		System.out.println(q instanceof Square);
		// �ж��������Ƿ�Ϊ�ı��ε�����
		System.out.println(s instanceof Quadrangle);
		// �����������Ƿ�ΪԲ�ε�����
		System.out.println(q instanceof Circular);
	}
}

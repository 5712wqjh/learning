class Shape { }								// ͼ����

class Square extends Shape { }				// ��������̳�ͼ����

class Circular extends Shape { }				// Բ����̳�ͼ����

public class Demo6 {
	public static void draw(Shape s) {			// ���Ʒ���
		if (s instanceof Square) {				// �����������
			System.out.println("����������");
		} else if (s instanceof Circular) {		// �����Բ��
			System.out.println("����Բ��");
		} else {							// �������������
			System.out.println("���Ƹ���ͼ��");
		}
	}

	public static void main(String[] args) {
		draw(new Shape());
		draw(new Square());
		draw(new Circular());
	}
}

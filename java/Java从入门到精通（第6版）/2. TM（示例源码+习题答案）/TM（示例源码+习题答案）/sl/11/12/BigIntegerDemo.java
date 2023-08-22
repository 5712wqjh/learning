
import java.math.BigInteger;

public class BigIntegerDemo {
	public static void main(String[] args) {
		BigInteger b1= new BigInteger("987654321987654321"); // ��1��������
		BigInteger b2 = new BigInteger("123456789123456789"); // ��2��������
		// �ӷ�����
		System.out.println("�ӷ�������" + b1.add(b2));
		// ��������
		System.out.println("����������" + b1.subtract(b2));
		// �˷�����
		System.out.println("�˷�������" + b1.multiply(b2));
		// ��������
		System.out.println("����������" + b1.divide(b2));
		// ȡ������
		System.out.println("ȡ�̣�" + b1.divideAndRemainder(b2)[0]);
		// ȡ������
		System.out.println("ȡ������" + b1.divideAndRemainder(b2)[1]);
		// 2�η�����
		System.out.println("��2�η�������" + b1.pow(2));
		// �෴������
		System.out.println("ȡ�෴��������" + b1.negate());
	}
}

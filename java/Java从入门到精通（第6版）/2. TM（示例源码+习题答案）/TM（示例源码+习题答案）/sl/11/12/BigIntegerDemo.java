
import java.math.BigInteger;

public class BigIntegerDemo {
	public static void main(String[] args) {
		BigInteger b1= new BigInteger("987654321987654321"); // 第1个大数字
		BigInteger b2 = new BigInteger("123456789123456789"); // 第2个大数字
		// 加法运算
		System.out.println("加法操作：" + b1.add(b2));
		// 减法运算
		System.out.println("减法操作：" + b1.subtract(b2));
		// 乘法运算
		System.out.println("乘法操作：" + b1.multiply(b2));
		// 除法运算
		System.out.println("除法操作：" + b1.divide(b2));
		// 取商运算
		System.out.println("取商：" + b1.divideAndRemainder(b2)[0]);
		// 取余运算
		System.out.println("取余数：" + b1.divideAndRemainder(b2)[1]);
		// 2次方运算
		System.out.println("做2次方操作：" + b1.pow(2));
		// 相反数运算
		System.out.println("取相反数操作：" + b1.negate());
	}
}

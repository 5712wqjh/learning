
import java.lang.reflect.Constructor;

import com.mr.Demo;

public class ConstructorDemo {
	public static void main(String[] args) {
		Demo d1 = new Demo("10", "20", "30");
		Class<? extends Demo> demoClass = d1.getClass();
		// 获得所有构造方法
		Constructor[] declaredConstructors = demoClass.getDeclaredConstructors();
		for (int i = 0; i < declaredConstructors.length; i++) { // 遍历构造方法
			Constructor<?> constructor = declaredConstructors[i];
			System.out.println("查看是否允许带有可变数量的参数：" + constructor.isVarArgs());
			System.out.println("该构造方法的入口参数类型依次为：");
			Class[] parameterTypes = constructor.getParameterTypes(); // 获取所有参数类型
			for (int j = 0; j < parameterTypes.length; j++) {
				System.out.println(" " + parameterTypes[j]);
			}
			System.out.println("该构造方法可能抛出的异常类型为：");
			// 获得所有可能抛出的异常信息类型
			Class[] exceptionTypes = constructor.getExceptionTypes();
			for (int j = 0; j < exceptionTypes.length; j++) {
				System.out.println(" " + exceptionTypes[j]);
			}
			Demo d2 = null;
			try { // 如果该成员变量的访问权限为private，则抛出异常，即不允许访问
				if (i == 2) // 通过执行默认没有参数的构造方法创建对象
					d2 = (Demo) constructor.newInstance();
				else if (i == 1)
					// 通过执行具有两个参数的构造方法创建对象
					d2 = (Demo) constructor.newInstance("7", 5);
				else { // 通过执行具有可变数量参数的构造方法创建对象
					Object[] parameters = new Object[] { new String[] { "100", "200", "300" } };
					d2 = (Demo) constructor.newInstance(parameters);
				}
			} catch (Exception e) {
				System.out.println("在创建对象时抛出异常，下面执行setAccessible()方法");
				constructor.setAccessible(true); // 设置为允许访问
			}
			if (d2 != null) {
				d2.print();
				System.out.println();
			}
		}

	}
}


import java.lang.reflect.*;

import com.mr.Demo3;

public class MethondDemo {
	public static void main(String[] args) {
		Demo3 demo = new Demo3();
		Class demoClass = demo.getClass();
		// ������з���
		Method[] declaredMethods = demoClass.getDeclaredMethods();
		for (int i = 0; i < declaredMethods.length; i++) {
			Method method = declaredMethods[i]; // ��������
			System.out.println("����Ϊ��" + method.getName()); // ��÷�������
			System.out.println("�Ƿ�������пɱ������Ĳ�����" + method.isVarArgs());
			System.out.println("��ڲ�����������Ϊ��");
			// ������в�������
			Class[] parameterTypes = method.getParameterTypes();
			for (int j = 0; j < parameterTypes.length; j++) {
				System.out.println(" " + parameterTypes[j]);
			}
			// ��÷�������ֵ����
			System.out.println("����ֵ����Ϊ��" + method.getReturnType());
			System.out.println("�����׳����쳣�����У�");
			// ��÷��������׳��������쳣����
			Class[] exceptionTypes = method.getExceptionTypes();
			for (int j = 0; j < exceptionTypes.length; j++) {
				System.out.println(" " + exceptionTypes[j]);
			}
			boolean isTurn = true;
			while (isTurn) {
				try {// ����÷����ķ���Ȩ��Ϊprivate�����׳��쳣�������������
					isTurn = false;
					if ("staticMethod".equals(method.getName()))
						method.invoke(demo); // ִ��û����ڲ����ķ���
					else if ("publicMethod".equals(method.getName()))
						System.out.println("����ֵΪ��" + method.invoke(demo, 168)); // ִ�з���
					else if ("protectedMethod".equals(method.getName()))
						System.out.println("����ֵΪ��" + method.invoke(demo, "7", 5)); // ִ�з���
					else if ("privateMethod".equals(method.getName())) {
						Object[] parameters = new Object[] { new String[] { "M", "W", "Q" } }; // �����ά����
						System.out.println("����ֵΪ��" + method.invoke(demo, parameters));
					}
				} catch (Exception e) {
					System.out.println("��ִ�з���ʱ�׳��쳣��" + "����ִ��setAccessible()������");
					method.setAccessible(true); // ����Ϊ�������
					isTurn = true;
				}
			}
			System.out.println();
		}
	}
}


import java.lang.reflect.Constructor;

import com.mr.Demo;

public class ConstructorDemo {
	public static void main(String[] args) {
		Demo d1 = new Demo("10", "20", "30");
		Class<? extends Demo> demoClass = d1.getClass();
		// ������й��췽��
		Constructor[] declaredConstructors = demoClass.getDeclaredConstructors();
		for (int i = 0; i < declaredConstructors.length; i++) { // �������췽��
			Constructor<?> constructor = declaredConstructors[i];
			System.out.println("�鿴�Ƿ�������пɱ������Ĳ�����" + constructor.isVarArgs());
			System.out.println("�ù��췽������ڲ�����������Ϊ��");
			Class[] parameterTypes = constructor.getParameterTypes(); // ��ȡ���в�������
			for (int j = 0; j < parameterTypes.length; j++) {
				System.out.println(" " + parameterTypes[j]);
			}
			System.out.println("�ù��췽�������׳����쳣����Ϊ��");
			// ������п����׳����쳣��Ϣ����
			Class[] exceptionTypes = constructor.getExceptionTypes();
			for (int j = 0; j < exceptionTypes.length; j++) {
				System.out.println(" " + exceptionTypes[j]);
			}
			Demo d2 = null;
			try { // ����ó�Ա�����ķ���Ȩ��Ϊprivate�����׳��쳣�������������
				if (i == 2) // ͨ��ִ��Ĭ��û�в����Ĺ��췽����������
					d2 = (Demo) constructor.newInstance();
				else if (i == 1)
					// ͨ��ִ�о������������Ĺ��췽����������
					d2 = (Demo) constructor.newInstance("7", 5);
				else { // ͨ��ִ�о��пɱ����������Ĺ��췽����������
					Object[] parameters = new Object[] { new String[] { "100", "200", "300" } };
					d2 = (Demo) constructor.newInstance(parameters);
				}
			} catch (Exception e) {
				System.out.println("�ڴ�������ʱ�׳��쳣������ִ��setAccessible()����");
				constructor.setAccessible(true); // ����Ϊ�������
			}
			if (d2 != null) {
				d2.print();
				System.out.println();
			}
		}

	}
}

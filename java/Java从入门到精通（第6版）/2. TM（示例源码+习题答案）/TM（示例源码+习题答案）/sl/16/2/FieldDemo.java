import java.lang.reflect.Field;
import com.mr.Demo2;

public class FieldDemo {
	public static void main(String[] args) {
		Demo2 example = new Demo2();
		Class exampleC = example.getClass();
		// ������г�Ա����
		Field[] declaredFields = exampleC.getDeclaredFields();
		for (int i = 0; i < declaredFields.length; i++) { // ������Ա����
			Field field = declaredFields[i];
			System.out.println("����Ϊ��" + field.getName()); // ��ó�Ա��������
			Class fieldType = field.getType(); // ��ó�Ա��������
			System.out.println("����Ϊ��" + fieldType);
			boolean isTurn = true;
			while (isTurn) {
				// ����ó�Ա�����ķ���Ȩ��Ϊprivate�����׳��쳣�������������
				try {
					isTurn = false;
					// ��ó�Ա����ֵ
					System.out.println("�޸�ǰ��ֵΪ��" + field.get(example));
					if (fieldType.equals(int.class)) { // �жϳ�Ա�����������Ƿ�Ϊint��
						System.out.println("���÷���setInt()�޸ĳ�Ա������ֵ");
						field.setInt(example, 168); // Ϊint�ͳ�Ա������ֵ
					} else if (fieldType.equals(float.class)) { // �жϳ�Ա�����������Ƿ�Ϊfloat��
						System.out.println("���÷���setFloat()�޸ĳ�Ա������ֵ");
						field.setFloat(example, 99.9F); // Ϊfloat�ͳ�Ա������ֵ
						// �жϳ�Ա�����������Ƿ�Ϊboolean��
					} else if (fieldType.equals(boolean.class)) {
						System.out.println("���÷���setBoolean()�޸ĳ�Ա������ֵ");
						field.setBoolean(example, true); // Ϊboolean�ͳ�Ա������ֵ
					} else {
						System.out.println("���÷���set()�޸ĳ�Ա������ֵ");
						field.set(example, "MWQ"); // ����Ϊ�������͵ĳ�Ա������ֵ
					}
					// ��ó�Ա����ֵ
					System.out.println("�޸ĺ��ֵΪ��" + field.get(example));
				} catch (Exception e) {
					System.out.println("�����ó�Ա����ֵʱ�׳��쳣��" + "����ִ��setAccessible()������");
					field.setAccessible(true); // ����Ϊ�������
					isTurn = true;
				}
			}
			System.out.println();
		}
	}
}

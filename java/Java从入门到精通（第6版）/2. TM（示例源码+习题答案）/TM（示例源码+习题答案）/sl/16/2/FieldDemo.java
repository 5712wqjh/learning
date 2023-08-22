import java.lang.reflect.Field;
import com.mr.Demo2;

public class FieldDemo {
	public static void main(String[] args) {
		Demo2 example = new Demo2();
		Class exampleC = example.getClass();
		// 获得所有成员变量
		Field[] declaredFields = exampleC.getDeclaredFields();
		for (int i = 0; i < declaredFields.length; i++) { // 遍历成员变量
			Field field = declaredFields[i];
			System.out.println("名称为：" + field.getName()); // 获得成员变量名称
			Class fieldType = field.getType(); // 获得成员变量类型
			System.out.println("类型为：" + fieldType);
			boolean isTurn = true;
			while (isTurn) {
				// 如果该成员变量的访问权限为private，则抛出异常，即不允许访问
				try {
					isTurn = false;
					// 获得成员变量值
					System.out.println("修改前的值为：" + field.get(example));
					if (fieldType.equals(int.class)) { // 判断成员变量的类型是否为int型
						System.out.println("利用方法setInt()修改成员变量的值");
						field.setInt(example, 168); // 为int型成员变量赋值
					} else if (fieldType.equals(float.class)) { // 判断成员变量的类型是否为float型
						System.out.println("利用方法setFloat()修改成员变量的值");
						field.setFloat(example, 99.9F); // 为float型成员变量赋值
						// 判断成员变量的类型是否为boolean型
					} else if (fieldType.equals(boolean.class)) {
						System.out.println("利用方法setBoolean()修改成员变量的值");
						field.setBoolean(example, true); // 为boolean型成员变量赋值
					} else {
						System.out.println("利用方法set()修改成员变量的值");
						field.set(example, "MWQ"); // 可以为各种类型的成员变量赋值
					}
					// 获得成员变量值
					System.out.println("修改后的值为：" + field.get(example));
				} catch (Exception e) {
					System.out.println("在设置成员变量值时抛出异常，" + "下面执行setAccessible()方法！");
					field.setAccessible(true); // 设置为允许访问
					isTurn = true;
				}
			}
			System.out.println();
		}
	}
}

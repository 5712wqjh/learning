interface ArraysConsInterface<T> {                   // 构造方法接口
    // 抽象方法返回对象数组，方法参数决定数组个数
    T action(int n);
}
public class ArraysConsDemo {
    public static void main(String[] args) {
        // 引用数组的构造方法
        ArraysConsInterface<ArraysConsDemo[]> a = ArraysConsDemo[]::new;
        ArraysConsDemo array[] = a.action(3);      // 接口创建数组，并指定数组个数
        array[0] = new ArraysConsDemo();           // 给数组元素实例化
        array[1] = new ArraysConsDemo();
        array[2] = new ArraysConsDemo();
        // 如果调用或给array[3]赋值，代码则会抛出数组下标越界异常
        // array[3] = new ArraysConsDemo();
    }
}

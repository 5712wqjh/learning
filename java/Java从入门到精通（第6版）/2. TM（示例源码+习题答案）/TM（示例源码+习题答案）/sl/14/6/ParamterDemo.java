interface AdditionInterface {                           // 加法接口
    int add(int a, int b);                              // 加法的抽象方法
}

public class ParamterDemo {                             // 测试类
    public static void main(String[] args) {
        // lambda表达式实现加法接口，返回参数相加的值
        AdditionInterface np = (x, y) -> x + y;
        int result = np.add(15, 26);                   // 调用接口方法
        System.out.println("相加结果:" + result);     // 输出向相加结果
    }
}

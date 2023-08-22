interface StaticMethodInterface { 							// 测试接口
    int method(int a, int b);  								// 抽象方法
}
public class StaticMethodDemo {
    static int add(int x, int y) {								// 静态方法，返回两个参数相加的结果
        return x + y;                         				//返回相加结果
    }

    public static void main(String[] args) {
        StaticMethodInterface sm = StaticMethodDemo::add; 		//引用StaticMethodDemo类的静态方法
        int result = sm.method(15, 16);						//直接调用接口方法获取结果
        System.out.println("接口方法结果：" + result); 			//输出结果
    }
}

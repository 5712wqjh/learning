interface VariableInterface1 { 				// 测试接口
    void method(); 						// 测试方法
}

public class VariableDemo1 { 			// 测试类
    public static void main(String[] args) {
        int value = 100;					// 创建局部变量
        VariableInterface1 v = () -> {		// 实现测试接口
            int num = value - 90;			// 使用局部变量赋值
            value = 12; 					// 更改局部变量，此处会报错，无法通过编译
        };
    }
}

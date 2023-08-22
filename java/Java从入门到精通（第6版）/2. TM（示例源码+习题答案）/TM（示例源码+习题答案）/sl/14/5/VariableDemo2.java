interface VariableInterface2 {								// 测试接口
    void method(); 										// 测试方法
}

public class VariableDemo2 {								// 测试类
    int value = 100;										// 创建类成员变量
    public void action() { 								// 创建类成员方法
        VariableInterface2 v = () -> {						// 实现测试接口
            value = -12;									// 更改成员变量，没提示任何错误
        };
      
        System.out.println("运行接口方法前value=" + value);		// 运行接口方法前先输出成员变量值
        v.method();										// 运行接口方法
        System.out.println("运行接口方法后value=" + value); 	// 运行接口方法后再输出成员变量值
    }
    public static void main(String[] args) {
        VariableDemo2 demo = new VariableDemo2();			// 创建测试类对象
        demo.action(); 									// 执行测试类方法
    }
}

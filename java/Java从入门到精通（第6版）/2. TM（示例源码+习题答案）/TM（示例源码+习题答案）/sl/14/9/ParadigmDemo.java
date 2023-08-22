import java.util.HashSet;
interface ParadigmInterface<T> {                           // 测试接口
    int method(T[] t);                                      // 抽象方法
}

public class ParadigmDemo {// 测试类
    // 静态方法，使用泛型参数，在方法名之前定义泛型。此方法用于查找数组中的重复元素个数
    static public <T> int repeatCoount(T[] t) {
        int arrayLength = t.length;                     	// 记录数组长度
        java.util.HashSet<T> set = new HashSet<>(); 		// 创建哈希集合
        for (T tmp : t) {                        			// 遍历数组
            set.add(tmp);  							// 将数组元素放入集合中
        }
        return arrayLength - set.size();                    // 返回数组长度与集合长度的差
    }

    public static void main(String[] args) {
        Integer a[] = {1, 1, 2, 3, 1, 5, 6, 1, 8, 8};   			// 整数数组
        
        String s[] = {"王", "李", "赵", "陈", "李", "孙", "张"};		// 字符串数组
        // 创建接口对象，Integer作为泛型，引入ParadigmDemo类的静态方法,方法名要定义泛型
        ParadigmInterface<Integer> p1 = ParadigmDemo::<Integer> repeatCoount;
        // 调用接口方法
        System.out.println("整数数组重复元素个数：" + p1.method(a));
        // 创建接口对象，String作为泛型，引入ParadigmDemo类的静态方法
 		// 方法名若不定义泛型，则默认使用接口已定义好的的泛型
        ParadigmInterface<String> p2 = ParadigmDemo::repeatCoount;
        // 调用接口对象方法
        System.out.println("字符串数组重复元素个数：" + p2.method(s));
    }
}

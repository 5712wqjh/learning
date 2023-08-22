import java.text.SimpleDateFormat;
import java.util.Date;
interface InstanceMethodInterface {                    // 创建测试接口
    String method(Date date);                           // 带参数的抽象方法
}
public class InstanceMethodDemo {
    public String format(Date date) {                  // 格式化方法
        // 创建日期格式化对象，并指定日期格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);                       // 返回格式化结果
    }

    public static void main(String[] args) {
        // 创建类对象
        InstanceMethodDemo demo = new InstanceMethodDemo();
        // 引用类对象的方法
        InstanceMethodInterface im = demo::format;
        Date date = new Date();                       // 创建日期对象
        System.out.println("默认格式：" + date);     // 输出日期对象默认格式
        // 输出经过接口方法处理过的格式
        System.out.println("接口输出的格式：" + im.method(date));
    }
}
